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
            Reset();
        }

        private void Reset()
        {
            interpreter = new ChunkyInterpreter();
        }

        private object Interpret(string text)
        {
            return interpreter.Interpret(text);
        }

        private object Global(string name)
        {
            return interpreter.GetGlobal(name);
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

        [Test]
        public void Three_minus_two()
        {
            Interpret("3 - 2;").ShouldEqual(1);
        }

        [Test]
        public void Three_times_two()
        {
            Interpret("3 * 2;").ShouldEqual(6);
        }

        [Test]
        public void Times_precedence()
        {
            Interpret("1 + 3 * 2;").ShouldEqual(7);
        }

        [Test]
        public void Paren_precedence()
        {
            Interpret("(1 + 3) * 2;").ShouldEqual(8);
        }
    }
}
