using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace MyArray
{
    public partial class Form1 : Form
    {
        int x = 0;
        int[] values = new int[10];

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string message = "Are you sure you want to exit?";
            string title = "Exit";

            MessageBoxButtons buttons = MessageBoxButtons.YesNo; //Yes and No dialog buttons
            DialogResult result = MessageBox.Show(message, title, buttons); //Message box

            if (result == DialogResult.Yes) //Yes button
            {
                this.Close(); //Close Applicatiion
            }
            else
            {
                // Do nothing 
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                if (this.x < values.Length)
                {
                    values[this.x++] = int.Parse(textBox1.Text);
                    textBox1.Text = "";
                }
                else
                {
                    Console.WriteLine("Values are more than the array size");
                }
            }
            catch (IndexOutOfRangeException ex)
            {
                Console.WriteLine("Index is out of Range");
                Console.WriteLine(ex.Message);
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Wrong Format");
                Console.WriteLine(ex.Message);
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("Empty Textbox");
                Console.WriteLine(ex.Message);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            foreach (var item in values)
            {
                Console.Out.WriteLine(item);
            }
        }
    }
}
