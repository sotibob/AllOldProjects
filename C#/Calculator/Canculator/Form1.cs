//Sotonte Bob-manuel
//C# Programming CIST 2341_Lab03
//20th of September,2020.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Form1 : Form
    {
        //Variables declared
        double M = 0;
        StreamWriter M3;

        public Form1()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e) //Exit button
        {
            this.Close(); // Close Application
        }

        private void button1_Click(object sender, EventArgs e) //Calculate Button
        {
            try
            {
                if (radioButton1.Checked) // if Add 
                {
                    double Avalue1 = double.Parse(textBox1.Text); // New Variable, received from textbox1
                    double Avalue2 = double.Parse(textBox2.Text); // New Variable, received from textbox2
                    double Avalue = Avalue1 + Avalue2; //Calculate with the new variables
                    textBox3.Text = Avalue.ToString(); //Display Answer in textbox3
                    Console.WriteLine(Avalue);
                }
                else if (radioButton2.Checked) // if Subtract
                {
                    double Svalue1 = double.Parse(textBox1.Text); //New Variable, received from textbox1
                    double Svalue2 = double.Parse(textBox2.Text); //New Variable, received from textbox2
                    double Svalue = Svalue1 - Svalue2; //Calculate with the new variables
                    textBox3.Text = Svalue.ToString(); //Display Answer in textbox3
                    Console.WriteLine(Svalue);
                }
                else if (radioButton3.Checked) // if Multiply
                {
                    double Mvalue1 = double.Parse(textBox1.Text); //New Variable, received from textbox1
                    double Mvalue2 = double.Parse(textBox2.Text); //New Variable, received from textbox2
                    double Mvalue = Mvalue1 * Mvalue2; //Calculate with the new variables
                    textBox3.Text = Mvalue.ToString(); //Display Answer in textbox3
                    Console.WriteLine(Mvalue);
                }
                else if (radioButton4.Checked) // if divide
                {
                    double Dvalue1 = double.Parse(textBox1.Text); //New Variable, received from textbox1
                    double Dvalue2 = double.Parse(textBox2.Text); //New Variable, received from textbox2
                    double Dvalue = Dvalue1 / Dvalue2; //Calculate with the new variables
                    textBox3.Text = Dvalue.ToString(); //Display Answer in textbox3
                    Console.WriteLine(Dvalue);
                }
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine("Cannot Divide by Zero");
                Console.WriteLine(ex.Message);
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Error: Invalid Input"); //Show Message
                Console.WriteLine(ex.Message);
            }
        }
        private void button2_Click(object sender, EventArgs e) //Clear Button
        {
            //Resets everything that changed
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label1.Text = "";
            radioButton1.Visible = true;
            radioButton2.Visible = true;
            radioButton3.Visible = true;
            radioButton4.Visible = true;
            M = 0;
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e) // Add
        {
            radioButton1.Visible = true;
            //Clears the textboxes and assigns a new label name
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label1.Text = "plus";
            M = 0;
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e) //Subtract
        {
            radioButton2.Visible = true;
            //Clears the textboxes and assigns a new label name
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label1.Text = "minus";
            M = 0;
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e) //Multiply
        {
            radioButton3.Visible = true;
            //Clears the textboxes and assigns a new label name
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label1.Text = "times";
            M = 0;
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e) //Divide
        {
            radioButton4.Visible = true;
            //Clears the textboxes and assigns a new label name
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label1.Text = "divided by";
            M = 0;
        }

        private void clearToolStripMenuItem_Click(object sender, EventArgs e) //Clear Menu
        {
            //Resets everything that changed
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label1.Text = "";
            radioButton1.Visible = true;
            radioButton2.Visible = true;
            radioButton3.Visible = true;
            radioButton4.Visible = true;
            M = 0;
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e) //Exit Menu
        {
            this.Close(); // Close Application
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e) //About Menu
        {
            MessageBox.Show("About us"); // Display Message
        }

        private void colorToolStripMenuItem_Click(object sender, EventArgs e) // Color dialogue box
        {
            ColorDialog dlg = new ColorDialog();

            if (dlg.ShowDialog() == DialogResult.OK) //If Ok is clicked
            {
                this.BackColor = dlg.Color; //Display Picked BackColor
            }
        }

        private void ForButton_Click(object sender, EventArgs e)
        {
            for (int x = 0; x < 10; x++) //For Statement
            {
                MessageBox.Show("Go Falcons"); //Displays Message
            }
        }

        private void WhileButton_Click(object sender, EventArgs e)
        {
            int y = 0; // Variable declared
            while (y < 10) //While Statement
            {
                MessageBox.Show("Go Falcons"); //Displays Message
                y++; //Loop Control Variable
            }
        }

        private void MButton_Click(object sender, EventArgs e)
        {
            try
            {
                M = double.Parse(textBox3.Text); //New Variable, received from textbox3
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("Calculate First");
                Console.WriteLine(ex.Message);
            }
        }
        private void M3Button_Click(object sender, EventArgs e)
        {
            //Stores Answer in file memory
            M3 = File.CreateText("Results.txt");
            M3.WriteLine(textBox3.Text);
            M3.Close();
        }

        private void MItems_MouseEnter(object sender, EventArgs e)
        {
            try
            {
                MItems.Text = M.ToString(); //Displays Answer in Memory Variable
            }
            catch (NullReferenceException  ex)
            {
                Console.WriteLine("Empty Textbox");
                Console.WriteLine(ex.Message);
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine("Cannot divide by Zero");
                Console.WriteLine(ex.Message);
            }
        }

        private void MItems_MouseLeave(object sender, EventArgs e)
        {
            MItems.Text = "MItems"; //Displays Text
        }
    }
}
