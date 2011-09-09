using System.Collections.Generic;

namespace Chunky
{
    public class MemorySpace
    {
        private readonly IDictionary<string, object> _members;

        public MemorySpace()
        {
            _members = new Dictionary<string, object>();
        }

        public object GetMember(string name)
        {
            return _members[name];
        }

        public object SetMember(string name, object obj)
        {
            return _members[name] = obj;
        }
    }
}