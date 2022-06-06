//Name: Sotonte Bob-manuel
//Professor: Ermias J Mamo
//Class: C# Programming CIST 2341_Lab03
//Date: 27th of September,2020.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Area
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }



        private void ExitBtn_Click(object sender, EventArgs e)
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

        private void ClearBtn_Click(object sender, EventArgs e)
        {
            //Clears and resets everything under
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox1.Visible = true; 
            textBox2.Visible = true; 
            textBox3.Visible = true; 
            label1.Text = "Radius";
            label2.Text = "Side";
            label3.Text = "Area";
            label1.Visible = true;
            label2.Visible = true;
            label3.Visible = true;
            radioButton1.Checked = false;
            radioButton2.Checked = false;
            radioButton3.Checked = false;
            comboBox1.SelectedItem = null;
            listBox1.SelectedItem = null;
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            label1.Text = "Radius"; //Displays on Label1
            label1.Visible = true;  //Makes label1 appear
            textBox1.Visible = true; //Makes textbox1 appear
            textBox2.Visible = false; //Makes textbox2 disappear
            textBox3.Visible = false; //Makes textbox3 disappear
            label2.Visible = false; //Makes Label2 disappear
            label3.Visible = false; //Makes Label3 disappear
            textBox1.Text = "";
        }

        private void CalcBtn_Click(object sender, EventArgs e)
        {
            try
            {
                if (radioButton1.Checked) //radiobutton1 is selected
                {
                    double Radius = double.Parse(textBox1.Text); //Takes the input from textbox1
                    double CAnswer = Circle(Radius); //Circle functions is called and the value is passed
                    textBox3.Visible = true; //Makes textbox3 reappear
                    label3.Visible = true; //Makes label3 visible
                    textBox3.Text = CAnswer.ToString(); // Displays the Area
                }
                else if (radioButton2.Checked) //radiobutton2 is selected
                {
                    double Height = double.Parse(textBox1.Text); //Takes the input from textbox1
                    double Width = double.Parse(textBox2.Text); //Takes the input from textbox2
                    double RAnswer = Rectangle(Height, Width); //Rectangle functions is called and the value is passed
                    textBox3.Visible = true; //Makes textbox3 reappear
                    label3.Visible = true; //Makes label3 visible
                    textBox3.Text = RAnswer.ToString(); // Displays the Area
                }
                else if (radioButton3.Checked) //radiobutton2 is selected
                {
                    double Side = double.Parse(textBox2.Text); //Takes the input from textbox2
                    double SAnswer = Square(Side); //Square functions is called and the value is passed
                    textBox3.Visible = true; //Makes textbox3 reappear
                    label3.Visible = true; //Makes label3 visible
                    textBox3.Text = SAnswer.ToString(); // Displays the Area
                }
            }
            catch
            {
                MessageBox.Show("Make sure to input the variables and choose a shape before clicking");
            }
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            label2.Text = "Side"; //Displays on label2
            label2.Visible = true; //Makes label2 appear
            textBox2.Visible = true; //Makes textbox2 appear
            textBox1.Visible = false; //Makes textbox1 disappear
            textBox3.Visible = false; //Makes textbox3 disappear
            label1.Visible = false; //Makes Label1 disappear
            label3.Visible = false; //Makes Label3 disappear
            textBox2.Text = "";
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox1.Visible = true; //Makes textbox1 appear
            textBox2.Visible = true; //Makes textbox2 appear
            label1.Visible = true; //Makes Label1 appear
            label2.Visible = true; //Makes label2 appear
            textBox3.Visible = false; //Makes textbox3 disappear
            label3.Visible = false; //Makes Label3 disappear
            label1.Text = "Height"; //Displays on label1
            label2.Text = "Width"; //displays on label2
            textBox1.Text = "";
            textBox2.Text = "";
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
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

        private void clearToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //Clears and resets everything under
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox1.Visible = true;
            textBox2.Visible = true;
            textBox3.Visible = true;
            label1.Text = "Radius";
            label2.Text = "Side";
            label3.Text = "Area";
            label1.Visible = true;
            label2.Visible = true;
            label3.Visible = true;
            radioButton1.Checked = false;
            radioButton2.Checked = false;
            radioButton3.Checked = false;
            comboBox1.SelectedItem = null;
            listBox1.SelectedItem = null;
        }

        private void circleToolStripMenuItem_Click(object sender, EventArgs e)
        {
            radioButton1.Checked = true; //Radiobutton1 is checked
        }

        private void rectangleToolStripMenuItem_Click(object sender, EventArgs e)
        {
            radioButton2.Checked = true; //Radiobutton2 is checked
        }

        private void squareToolStripMenuItem_Click(object sender, EventArgs e)
        {
            radioButton3.Checked = true; //Radiobutton3 is checked
        }

        public void Clear()
        {
            //Clears and resets everything under
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox1.Visible = true;
            textBox2.Visible = true;
            textBox3.Visible = true;
            label1.Text = "Radius";
            label2.Text = "Side";
            label3.Text = "Area";
            label1.Visible = true;
            label2.Visible = true;
            label3.Visible = true;
            radioButton1.Checked = false;
            radioButton2.Checked = false;
            radioButton3.Checked = false;
        }

        public void Exit()
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

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (listBox1.SelectedIndex is 0) //If Circle
            {
                radioButton1.Checked = true; //Radiobutton1 is checked
            }
            if (listBox1.SelectedIndex is 1) //if Rectangle
            {
                radioButton2.Checked = true; //Radiobutton2 is checked
            }
            if (listBox1.SelectedIndex is 2) //if Square
            {
                radioButton3.Checked = true; //Radiobutton3 is checked
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex is 0) //If Circle
            {
                radioButton1.Checked = true; //Radiobutton1 is checked
            }
            if (comboBox1.SelectedIndex is 1) //if Rectangle
            {
                radioButton2.Checked = true; //Radiobutton2 is checked
            }
            if (comboBox1.SelectedIndex is 2) //if Square
            {
                radioButton3.Checked = true; //Radiobutton3 is checked
            }
        }
        private static double Circle(double Radius) //Circle function
        {
            double CArea = 3.14 * Radius * Radius; //Calculates the Area of a Circle
            return CArea; //returns Area Value
        }
        private static double Rectangle(double Height, double Width) // Rectangle Function
        {
            double RArea = Height * Width; //Calculates the Area of a Rectangle
            return RArea; //returns Area Value
        }
        private static double Square(double Side) //square function
        {
            double SArea = Side * Side; //Calculates the Area of a Square
            return SArea; //returns Area Value
        }
    }
}