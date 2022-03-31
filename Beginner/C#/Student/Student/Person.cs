//Name: Sotonte Bob-manuel
//Professor: Ermias J Mamo
//Class: C# Programming CIST 2341_Lab12
//Date: 15th of November,2020.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Student
{
    public class Person //  Student Class
    {
        private String name;
        private String address;
        private int phone;
        private String email;

        public Person()
        {
            name = "";
            address = "";
            phone = 0;
            email = "";
        }
        public Person(String Name, String Address, int Phone,String Email)
        {
            name = Name;
            address = Address;
            phone = Phone;
            email = Email;
        }
        //Get and set methods
        public String Name
        {
            set { name = value; }
            get { return name; }
        }
        public String Address
        {
            set { address = value; }
            get { return address; }
        }
        public int Phone
        {
            set { phone = value; }
            get { return phone; }
        }
        public String Email
        {
            set { email = value; }
            get { return email; }
        }
        public void Display() //Display method to display the values collected
        {
            Console.WriteLine("Your Name is: " + Name);
            Console.WriteLine("Your Address is: " + Address);
            Console.WriteLine("Your Phone is: " + Phone);
            Console.WriteLine("Your E-mail is: " + Email);
        }
    }
}
