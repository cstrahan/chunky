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

        private T Global<T>(string name)
        {
            return (T)interpreter.GetGlobal(name);
        }

        private void SetGlobal(string name, object obj)
        {
            interpreter.SetGlobal(name, obj);
        }

        [Test]
        public void Integer()
        {
            Interpret("1234;").ShouldEqual(1234)
                              .ShouldBeOfType<int>();
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

        [Test]
        public void If_then_truthy_condition()
        {
            Interpret("if (true) { 42; };").ShouldEqual(42);
        }

        [Test]
        public void If_then_falsy_condition()
        {
            Interpret("if (false) { 42; };").ShouldEqual(null);
        }

        [Test]
        public void If_then_else()
        {
            Interpret("if (false) { } else { 42; };").ShouldEqual(42);
        }

        [Test]
        public void If_then_else_empty()
        {
            Interpret("if (true) { } else { };").ShouldEqual(null);
        }

        [Test]
        public void Variable_get()
        {
            SetGlobal("a", 42);
            Interpret("a;").ShouldEqual(42);
        }

        [Test]
        public void Variable_set()
        {
            Interpret("a = 42;");
            Global("a").ShouldEqual(42);
        }

        [Test]
        public void Instance_field_set()
        {
            var dummy = new Dummy();
            SetGlobal("dummy", dummy);
            
            Interpret("dummy.object_field = 42;");

            Global<Dummy>("dummy").object_field.ShouldEqual(42);
        }

        [Test]
        public void Instance_property_set()
        {
            var dummy = new Dummy();
            SetGlobal("dummy", dummy);

            Interpret("dummy.object_property = 42;");

            Global<Dummy>("dummy").object_property.ShouldEqual(42);
        }
    }
}
