using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using Antlr.Runtime;

namespace Chunky
{
    class Program
    {
        static void Main(string[] args)
        {
            var reader = new StringReader("1 + 2;");
            var charStream = new ANTLRReaderStream(reader);
            var lexer = new ChunkyLexer(charStream);
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new ChunkyParser(tokenStream);
            var ast = parser.program().Tree;
            Console.WriteLine(ast.Token.ToString());
            
            //---------------
            Console.WriteLine("DONE . . .");
            Console.ReadKey(true);
        }
    }
}
