using System;

namespace Chunky
{
    internal static class Operator
    {
        public static object Add(object lhs, object rhs)
        {
            if (lhs is double)
            {
                if (rhs is double) return (double)lhs + (double)rhs;
                if (rhs is int) return (double)lhs + (int)rhs;
            }

            if (lhs is int)
            {
                if (rhs is double) return (int)lhs + (double)rhs;
                if (rhs is int) return (int)lhs + (int)rhs;
            }

            throw new InvalidOperationException(InvalidOperationMessage("add", lhs, rhs));
        }

        public static object Substract(object lhs, object rhs)
        {
            if (lhs is double)
            {
                if (rhs is double) return (double)lhs - (double)rhs;
                if (rhs is int) return (double)lhs - (int)rhs;
            }

            if (lhs is int)
            {
                if (rhs is double) return (int)lhs - (double)rhs;
                if (rhs is int) return (int)lhs - (int)rhs;
            }

            throw new InvalidOperationException(InvalidOperationMessage("subtract", lhs, rhs));
        }

        public static object Multiply(object lhs, object rhs)
        {
            if (lhs is double)
            {
                if (rhs is double) return (double)lhs * (double)rhs;
                if (rhs is int) return (double)lhs * (int)rhs;
            }

            if (lhs is int)
            {
                if (rhs is double) return (int)lhs * (double)rhs;
                if (rhs is int) return (int)lhs * (int)rhs;
            }

            throw new InvalidOperationException(InvalidOperationMessage("multiply", lhs, rhs));
        }

        public static object Divide(object lhs, object rhs)
        {
            if (lhs is double)
            {
                if (rhs is double) return (double)lhs / (double)rhs;
                if (rhs is int) return (double)lhs / (int)rhs;
            }

            if (lhs is int)
            {
                if (rhs is double) return (int)lhs / (double)rhs;
                if (rhs is int) return (int)lhs / (int)rhs;
            }

            throw new InvalidOperationException(InvalidOperationMessage("divide", lhs, rhs));
        }

        private static string InvalidOperationMessage(string operation, object lhs, object rhs)
        {
            var type1 = lhs.GetType().Name;
            var type2 = rhs.GetType().Name;
            return string.Format("Can't add operands of type \"{0}\" and \"{1}\"", type1, type2);
        }
    }
}