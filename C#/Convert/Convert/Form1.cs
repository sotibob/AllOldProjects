//Sotonte Bob-manuel
//C# Programming CIST2341_Lab03
//6th of September, 2020.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Convert
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void ConvertBtn_Click(object sender, EventArgs e)
        {
            try
            {
                if (radioButton1.Checked) //Fahrenheit to Celsius button is checked
                {
                    double Fahrenheit;
                    double Celsius;

                    Fahrenheit = double.Parse(textBox2.Text); // Getting the Fahrenheit
                    radioButton2.Visible = false; //Making radiobutton2 disappear
                    textBox1.Visible = true; //Making textbox1 Appear
                    Text = "Fahrenheit to celsius"; //Changing the form text
                    Celsius = (Fahrenheit - 32) * 5 / 9; //Converting to Celsius
                    textBox1.Text = Celsius.ToString(); //Display the Celsius


                }
                else if (radioButton2.Checked) //Celsius to Fahrenheit button is checked
                {
                    double Celsius;
                    double Fahrenheit;

                    Celsius = double.Parse(textBox1.Text); //Getting the Celsius
                    radioButton1.Visible = false; //Making radiobutton1 disappear
                    textBox2.Visible = true; //Making textbox2 appear
                    Text = "Celsius to Fahrenheit"; //Changing the form text
                    Fahrenheit = (Celsius * 9 / 5) + 32; //Converting to Fahrenheit
                    textBox2.Text = Fahrenheit.ToString(); // Display the Fahrenheit
                }
            }
            catch
            {
                MessageBox.Show("You forgot to input a temperature"); //displays if the textbox is empty
            }
        }

        void ExitBtn_Click(object sender, EventArgs e)
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

        void ClearBtn_Click(object sender, EventArgs e)
        {
            //Clears and resets everything 
            textBox1.Text = "";
            textBox2.Text = "";
            radioButton1.Visible = true;
            radioButton2.Visible = true;
            textBox1.Visible = true;
            textBox2.Visible = true;
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            textBox1.Visible = false; //Making textbox1 disappear
            textBox2.Visible = true; //Making textbox2 appear
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox2.Visible = false; //Making textbox2 disappear
            textBox1.Visible = true; //Making texbox1 appear
        }
    }
}
