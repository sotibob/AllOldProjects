using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Schema;
using TwentyOne.Properties;

namespace TwentyOne
{
    public partial class TwentyOne : Form
    {
        int Total = 0;
        public TwentyOne()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e)
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

        private void Form1_Load(object sender, EventArgs e)
        {
            pictureBox1.Visible = false;
            pictureBox3.Visible = false;
            label1.Visible = false;
            label2.Visible = false;
            BackgroundImage = Resources.Board_2;
            Console.WriteLine("Click the Roll button to start playing and roll your dice.");
            Console.WriteLine("Keep rolling and once your total is up to 15, you only roll with a die next.");
            Console.WriteLine("Roll up to exactly 21 in Total, and you Win the game!");
            Console.WriteLine("Roll above 21 and you Lose the game!");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Die FirstDie = new Die();
            Die SecondDie = new Die();
            label1.Text = FirstDie.Random.ToString();
            label2.Text = SecondDie.Random.ToString();
            if (Total < 15)
            {
                pictureBox3.Image = null;
                pictureBox1.Image = null;
                pictureBox1.Visible = true;
                pictureBox3.Visible = true;
                label1.Visible = true;
                label2.Visible = true;
                switch (FirstDie.Random)
                {
                    case 1:
                        pictureBox1.Image = Resources._1;
                        break;
                    case 2:
                        pictureBox1.Image = Resources._2;
                        break;
                    case 3:
                        pictureBox1.Image = Resources._3;
                        break;
                    case 4:
                        pictureBox1.Image = Resources._4;
                        break;
                    case 5:
                        pictureBox1.Image = Resources._5;
                        break;
                    case 6:
                        pictureBox1.Image = Resources._6;
                        break;
                }
                Console.WriteLine("Your first die is: " + FirstDie.Random);
                switch (SecondDie.Random)
                {
                    case 1:
                        pictureBox3.Image = Resources._1;
                        break;
                    case 2:
                        pictureBox3.Image = Resources._2;
                        break;
                    case 3:
                        pictureBox3.Image = Resources._3;
                        break;
                    case 4:
                        pictureBox3.Image = Resources._4;
                        break;
                    case 5:
                        pictureBox3.Image = Resources._5;
                        break;
                    case 6:
                        pictureBox3.Image = Resources._6;
                        break;
                }
                Total = Total + FirstDie.Random + SecondDie.Random;
                Console.WriteLine("Your second die is: " + SecondDie.Random);
                Console.WriteLine("Your Total  is: " + Total);
                Console.WriteLine("");
            }
            else if ((Total >= 15) && (Total < 21))
            {
                pictureBox3.Visible = false;
                label2.Visible = false;
                switch (FirstDie.Random)
                {
                    case 1:
                        pictureBox1.Image = Resources._1;
                        break;
                    case 2:
                        pictureBox1.Image = Resources._2;
                        break;
                    case 3:
                        pictureBox1.Image = Resources._3;
                        break;
                    case 4:
                        pictureBox1.Image = Resources._4;
                        break;
                    case 5:
                        pictureBox1.Image = Resources._5;
                        break;
                    case 6:
                        pictureBox1.Image = Resources._6;
                        break;
                }
                Total = Total + FirstDie.Random;
                Console.WriteLine("Your only die rolled is : " + FirstDie.Random);
                Console.WriteLine("Your Total is: " + Total);
                Console.WriteLine("");
            }
            else if (Total == 21)
            {
                MessageBox.Show("Winner Winner Chicken Dinner!!!");
                Console.WriteLine("Winner Winner Chicken Dinner!!!");
                Console.WriteLine("Thanks for playing!");
                Console.WriteLine("");
            }
            else if (Total > 21)
            {
                MessageBox.Show("Try Your Luck Next Time.");
                Console.WriteLine("Try Your Luck Next Time.");
                Console.WriteLine("Thanks for playing!");
                Console.WriteLine("");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            pictureBox1.Visible = false;
            pictureBox3.Visible = false;
            label1.Visible = false;
            label2.Visible = false;
            Total = 0;
        }
    }
}
