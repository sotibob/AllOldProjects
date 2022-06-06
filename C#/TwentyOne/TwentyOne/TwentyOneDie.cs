using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace TwentyOne
{
    class Die
    {
        private readonly int value;
        private static Random random = new Random();

        public Die()
        {
            value = random.Next(1, 7);
        }
        public int Random
        {
            get { return value; }
        }
    }
}
