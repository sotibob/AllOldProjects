//Name: Sotonte Bob-manuel
//Professor: Ermias J Mamo
//Class: C# Programming CIST 2341_Lab12
//Date: 15th of November,2020.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Student
{
    public partial class Form1 : Form
    {
        Student student1; //Object created
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                // Collecting data from the textboxes
                int ID = int.Parse(textBox1.Text);
                String Name = textBox2.Text;
                String Address = textBox3.Text;
                int Phone = int.Parse(textBox4.Text);
                String Email = "Unavailable";
                String Major = textBox5.Text;
                double GPA = double.Parse(textBox6.Text);
                student1 = new Student(ID, Name, Address, Phone, Major, GPA, Email);
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (FormatException ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            student1.Display(); //display method
        }
    }
}
