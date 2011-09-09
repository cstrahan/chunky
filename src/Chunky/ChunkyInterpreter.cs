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

        public void GetGlobal(string name, object obj)
        {
            _globalsSpace[name] = obj;
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
                case ChunkyParser.PLUS: return Add(tree);
                case ChunkyParser.INT: return Int(tree); 
                default:
                    Console.WriteLine("Tree type \"" + ChunkyParser.tokenNames[tree.Type] + "\" not yet stupported.");
                    break;
            }

            return null;
        }

        private object Block(CommonTree tree)
        {
            object result = null;
            foreach (var child in tree.Children)
            {
                result = Exec((CommonTree)child);
            }

            return result;
        }

        private object Add(CommonTree tree)
        {
            var lhs = Convert.ToDouble(Exec((CommonTree)tree.Children[0]));
            var rhs = Convert.ToDouble(Exec((CommonTree)tree.Children[1]));
            
            return lhs + rhs;
        }

        private object Int(CommonTree tree)
        {
            return int.Parse(tree.Text);
        }
    }
}