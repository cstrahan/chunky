using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;

namespace Chunky.Tests
{
    [TestFixture]
    public class InterpreterTests
    {
        private ChunkyInterpreter interpreter;

        [SetUp]
        public void Before_each()
        {
            interpreter = new ChunkyInterpreter();
        }

        private object Interpret(string text)
        {
            return interpreter.Interpret(text);
        }

        [Test]
        public void Integer()
        {
            Interpret("1234;").ShouldEqual(1234);
        }

        [Test]
        public void Two_plus_three()
        {
            Interpret("2 + 3;").ShouldEqual(5);
        }
    }
}
