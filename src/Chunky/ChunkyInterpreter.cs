using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using Antlr.Runtime;
using Antlr.Runtime.Tree;

namespace Chunky
{
    public class ChunkyInterpreter
    {
        private readonly IDictionary<string, object> _globalsSpace;
        private readonly IDictionary<string, object> _currentSpace;

        public ChunkyInterpreter()
        {
            _currentSpace = _globalsSpace = new Dictionary<string, object>();
        }

        public void SetGlobal(string name, object obj)
        {
            _globalsSpace[name] = obj;
        }

        public object GetGlobal(string name)
        {
            return _globalsSpace[name];
        }

        public object Interpret(string text)
        {
            return Interpret(new StringReader(text));
        }

        public object Interpret(TextReader reader)
        {
            var charStream = new ANTLRReaderStream(reader);
            var lexer = new ChunkyLexer(charStream);
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new ChunkyParser(tokenStream);
            var ast = parser.program().Tree;

            return Exec(ast);
        }

        private object Exec(CommonTree tree)
        {
            switch (tree.Type)
            {
                case ChunkyParser.BLOCK: return Block(tree);
                case ChunkyParser.IF: return If(tree);
                case ChunkyParser.PLUS: return Add(tree);
                case ChunkyParser.MINUS: return Sub(tree);
                case ChunkyParser.STAR: return Mult(tree);
                case ChunkyParser.SLASH: return Div(tree);
                case ChunkyParser.TRUE: return true;
                case ChunkyParser.FALSE: return false;
                case ChunkyParser.INT: return Int(tree);
                case ChunkyParser.ID: return Identifier(tree);
                default:
                    Console.WriteLine("Tree type \"" + ChunkyParser.tokenNames[tree.Type] + "\" not yet stupported.");
                    break;
            }

            return null;
        }

        private object LhsOperand(CommonTree opTree)
        {
            var operand = Exec((CommonTree)opTree.Children[0]);
            return operand;
        }

        private object RhsOperand(CommonTree opTree)
        {
            var operand = Exec((CommonTree)opTree.Children[1]);
            return operand;
        }

        private object Block(CommonTree tree)
        {
            object result = null;

            if (tree.ChildCount > 0)
                foreach (var child in tree.Children)
                    result = Exec((CommonTree)child);
        
            return result;
        }

        private object If(CommonTree tree)
        {
            var predicate = Exec((CommonTree)tree.Children[0]);
            if (Operator.ToBool(predicate))
            {
                var consequent = Exec((CommonTree)tree.Children[1]);
                return consequent;
            }
            else if (tree.ChildCount == 3)
            {
                var alternative = Exec((CommonTree)tree.Children[2]);
                return alternative;
            }

            return null;
        }

        private object Add(CommonTree tree)
        {
            var lhs = LhsOperand(tree);
            var rhs = RhsOperand(tree);

            return Operator.Add(lhs, rhs);
        }

        private object Sub(CommonTree tree)
        {
            var lhs = LhsOperand(tree);
            var rhs = RhsOperand(tree);

            return Operator.Substract(lhs, rhs);
        }

        private object Mult(CommonTree tree)
        {
            var lhs = LhsOperand(tree);
            var rhs = RhsOperand(tree);

            return Operator.Multiply(lhs, rhs);
        }

        private object Div(CommonTree tree)
        {
            var lhs = LhsOperand(tree);
            var rhs = RhsOperand(tree);

            return Operator.Divide(lhs, rhs);
        }

        private object Int(CommonTree tree)
        {
            return int.Parse(tree.Text);
        }

        private object Identifier(CommonTree tree)
        {
            object obj;
            if (_currentSpace.TryGetValue(tree.Text, out obj))
                return obj;

            throw new InvalidOperationException("Undefined variable: " + tree.Text);
        }
    }
}