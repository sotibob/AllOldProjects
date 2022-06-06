using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GoTeam
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void ClickBtn_Click(object sender, EventArgs e)
        {
            HelloLbl.Text = "Chelsea Football Club";
            ExitButton.Visible = false;
            ClickBtn.Enabled = false;
            Text = "Chelsea Football Club";
        }

        private void ExitButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
