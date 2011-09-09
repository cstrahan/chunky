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
            var interpreter = new ChunkyInterpreter();
            var result = interpreter.Interpret("1 + 2;");
            
            //---------------
            Console.WriteLine("DONE . . .");
            Console.ReadKey(true);
        }
    }
}
