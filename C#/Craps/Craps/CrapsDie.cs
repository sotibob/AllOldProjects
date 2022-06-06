using System;
using System.Collections.Generic;
using System.Text;

namespace Craps
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
