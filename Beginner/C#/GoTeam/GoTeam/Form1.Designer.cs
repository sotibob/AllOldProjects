namespace GoTeam
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.HelloLbl = new System.Windows.Forms.Label();
            this.ClickBtn = new System.Windows.Forms.Button();
            this.ExitButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // HelloLbl
            // 
            this.HelloLbl.AutoSize = true;
            this.HelloLbl.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.HelloLbl.Location = new System.Drawing.Point(384, 44);
            this.HelloLbl.Name = "HelloLbl";
            this.HelloLbl.Size = new System.Drawing.Size(62, 13);
            this.HelloLbl.TabIndex = 0;
            this.HelloLbl.Text = "Hello World";
            // 
            // ClickBtn
            // 
            this.ClickBtn.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClickBtn.Location = new System.Drawing.Point(253, 219);
            this.ClickBtn.Name = "ClickBtn";
            this.ClickBtn.Size = new System.Drawing.Size(75, 23);
            this.ClickBtn.TabIndex = 1;
            this.ClickBtn.Text = "Go Team";
            this.ClickBtn.UseVisualStyleBackColor = false;
            this.ClickBtn.Click += new System.EventHandler(this.ClickBtn_Click);
            // 
            // ExitButton
            // 
            this.ExitButton.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ExitButton.ImageKey = "(none)";
            this.ExitButton.Location = new System.Drawing.Point(498, 219);
            this.ExitButton.Name = "ExitButton";
            this.ExitButton.Size = new System.Drawing.Size(75, 23);
            this.ExitButton.TabIndex = 2;
            this.ExitButton.Text = "Exit";
            this.ExitButton.UseVisualStyleBackColor = false;
            this.ExitButton.Click += new System.EventHandler(this.ExitButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.ExitButton);
            this.Controls.Add(this.ClickBtn);
            this.Controls.Add(this.HelloLbl);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label HelloLbl;
        private System.Windows.Forms.Button ClickBtn;
        private System.Windows.Forms.Button ExitButton;
    }
}

