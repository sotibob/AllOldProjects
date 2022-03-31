//Name: Sotonte Bob-manuel
//Professor: Ermias J Mamo
//Class: C# Programming CIST 2341_Lab03
//Date: 4th of October,2020.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PassingData
{
    public partial class Form1 : Form
    {
        double Highest;

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                double Num1 = double.Parse(textBox1.Text);
                double Num2 = double.Parse(textBox2.Text);
                double Num3 = double.Parse(textBox3.Text);
                double highest = maxReturn(Num1, Num2, Num3);
                textBox4.Text = highest.ToString();
            }
            catch
            {
                MessageBox.Show("Missing a number");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                double Num1 = double.Parse(textBox1.Text);
                double Num2 = double.Parse(textBox2.Text);
                double Num3 = double.Parse(textBox3.Text);
                maxGlobal(Num1, Num2, Num3);
            }
            catch
            {
                MessageBox.Show("Missing a number");
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                double Num1 = double.Parse(textBox1.Text);
                double Num2 = double.Parse(textBox2.Text);
                double Num3 = double.Parse(textBox3.Text);
                double Num4 = 0;
                double highest = maxRef(ref Num1, ref Num2, ref Num3, ref Num4);
                textBox4.Text = highest.ToString();
            }
            catch
            {
                MessageBox.Show("Missing a number");
            }
        }
        public static double maxReturn(double Num1, double Num2, double Num3)
        {
            double Highest = Math.Max(Num1, Math.Max(Num2, Num3));
            return Highest;
        }
        public void maxGlobal(double Num1, double Num2, double Num3)
        {
            Highest = Math.Max(Num1, Math.Max(Num2, Num3));
            textBox4.Text = Highest.ToString();
        }
        public static ref double maxRef(ref double a, ref double b, ref double c, ref double d)
        {
            d = Math.Max(a, Math.Max(b, c));
            return ref d;
        }
    }
}
