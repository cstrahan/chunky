using System;
using System.Linq;
using System.Reflection;

namespace Chunky
{
    internal static class Operator
    {
        public static void Assign(object lhs, string name, object rhs)
        {
            if (lhs == null)
                throw new InvalidOperationException("Null reference");

            var bindingAttrs = BindingFlags.Public | BindingFlags.Instance;
            var member = lhs.GetType().GetMember(name, bindingAttrs).FirstOrDefault();

            if (member == null)
                throw new InvalidOperationException("No such public instance member: " + name);

            switch (member.MemberType)
            {
                case MemberTypes.Property:
                    ((PropertyInfo)member).SetValue(lhs, rhs, null);
                    break;
                case MemberTypes.Field:
                    ((FieldInfo)member).SetValue(lhs, rhs);
                    break;
                default:
                    throw new InvalidOperationException("Can't assign to " + member.MemberType + "'s");
                    break;
            }
        }

        public static bool ToBool(object obj)
        {
            if (obj == null) return false;
            if (obj is bool && (bool)obj == false) return false;
            return true;
        }

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
            return string.Format("Can't {0} operands of type \"{1}\" and \"{2}\"", operation, type1, type2);
        }
    }
}