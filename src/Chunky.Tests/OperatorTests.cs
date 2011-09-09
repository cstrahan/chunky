using NUnit.Framework;

namespace Chunky.Tests
{
    [TestFixture]
    public class OperatorTests
    {
        [Test]
        public void Assign()
        {
            var dummy = new Dummy();
            
            Operator.Assign(dummy, "object_field", 42);
            dummy.object_field.ShouldEqual(42);

            Operator.Assign(dummy, "object_property", 42);
            dummy.object_property.ShouldEqual(42);
        }

        [Test]
        public void ToBool()
        {
            Operator.ToBool(true).ShouldEqual(true);
            Operator.ToBool("").ShouldEqual(true);
            Operator.ToBool(false).ShouldEqual(false);
            Operator.ToBool(null).ShouldEqual(false);
        }

        [Test]
        public void Add()
        {
            Operator.Add(.5, .5).ShouldEqual(1.0).ShouldBeOfType<double>();
            Operator.Add(1, .5).ShouldEqual(1.5).ShouldBeOfType<double>();
            Operator.Add(.5, 1).ShouldEqual(1.5).ShouldBeOfType<double>();
            Operator.Add(1, 1).ShouldEqual(2).ShouldBeOfType<int>();
        }

        [Test]
        public void Substract()
        {
            Operator.Substract(2.0, 1.0).ShouldEqual(1.0).ShouldBeOfType<double>();
            Operator.Substract(1, .5).ShouldEqual(0.5).ShouldBeOfType<double>();
            Operator.Substract(.5, 1).ShouldEqual(-0.5).ShouldBeOfType<double>();
            Operator.Substract(1, 2).ShouldEqual(-1).ShouldBeOfType<int>();
        }

        [Test]
        public void Multiply()
        {
            Operator.Multiply(2.0, 3.0).ShouldEqual(6.0).ShouldBeOfType<double>();
            Operator.Multiply(1, .5).ShouldEqual(0.5).ShouldBeOfType<double>();
            Operator.Multiply(.5, 1).ShouldEqual(0.5).ShouldBeOfType<double>();
            Operator.Multiply(1, 1).ShouldEqual(1).ShouldBeOfType<int>();
        }

        [Test]
        public void Divide()
        {
            Operator.Divide(.5, .5).ShouldEqual(1.0).ShouldBeOfType<double>();
            Operator.Divide(1, .5).ShouldEqual(2.0).ShouldBeOfType<double>();
            Operator.Divide(.5, 1).ShouldEqual(0.5).ShouldBeOfType<double>();
            Operator.Divide(10, 2).ShouldEqual(5).ShouldBeOfType<int>();
        }
    }
}