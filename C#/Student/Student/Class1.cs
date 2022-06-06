//Name: Sotonte Bob-manuel
//Professor: Ermias J Mamo
//Class: C# Programming CIST 2341_Lab12
//Date: 15th of November,2020.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Student
{
    class Student : Person //  Student Class
    {
        private int ID;
        private string major;
        private double GradePointAverage;

        public Student() : base()
        {
            ID = 0;
            major = "";
            GradePointAverage = 0;
        }
        public Student(int Identification, String Name, String Address, int Phone, String Major, double GPA, String Email) : base(Name, Address, Phone, Email)
        {
            ID = Identification;
            major = Major;
            GradePointAverage = GPA;
        }
        //Get and set methods
        public int Identification
        {
            set { ID = value; }
            get { return ID; }
        }
        public String Major
        {
            set {major = value; }
            get { return major; }
        }
        public double GPA
        {
            set { GradePointAverage = value; }
            get { return GradePointAverage; }
        }
        public new void Display() //Display method to display the values collected
        {
            base.Display();
            Console.WriteLine("Your ID is: " + Identification);
            Console.WriteLine("Your Major is: " +  Major);
            Console.WriteLine("Your GPA is: " +  GPA);
            Console.WriteLine("");
            Console.WriteLine("");
        }
    }
}
