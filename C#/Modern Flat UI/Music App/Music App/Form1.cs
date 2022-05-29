using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Music_App
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            customizeDesign();
        }

        private void customizeDesign()
        {
            //  Code to hide the Submenus
            panelMediaSubMenu.Visible = false;
            panelPlaylistSubMenu.Visible = false;
            panelToolsSubMenu.Visible = false;
            //..

        }


        //This method checks if the submenu is opened. If any of the submenu is found to be opened,
        //then it will close that submenu.
        private void hideSubmenu()
        {
            if(panelMediaSubMenu.Visible == true)
            {
                panelMediaSubMenu.Visible = false;
            }

            if(panelPlaylistSubMenu.Visible == true)
            {
                panelPlaylistSubMenu.Visible = false;
            }

            if(panelToolsSubMenu.Visible == true)
            {
                panelToolsSubMenu.Visible = false;
            }
        }


        //This function will be activated on the button click event. The submenu will either be closed or opened. 
        // If the submenu s opened, then the user want it to be closed then it will act on the else condition.
        // However, if the subenu is closed. The system first closes all the other submenus and then open this submenu.
        private void showSubmenu(Panel submenu)
        {
            if(submenu.Visible == false)
            {
                hideSubmenu();
                submenu.Visible = true;
            }
            else
            {
                submenu.Visible = false;
            }
        }

        private void btnMedia_Click(object sender, EventArgs e)
        {
            showSubmenu(panelMediaSubMenu);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            openChildForm(new Form2());
            hideSubmenu();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button9_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button13_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void button12_Click(object sender, EventArgs e)
        {
            //..
            // Your Code
            //..
            hideSubmenu();
        }

        private void btnPlaylist_Click(object sender, EventArgs e)
        {
            showSubmenu(panelPlaylistSubMenu);
        }

        private void btnTools_Click(object sender, EventArgs e)
        {
            showSubmenu(panelToolsSubMenu);
        }

        private void btnEqualizer_Click(object sender, EventArgs e)
        {
            openChildForm(new Form3());
            hideSubmenu();
        }

        private void button16_Click(object sender, EventArgs e)
        {
            hideSubmenu();
        }

        private Form activeForm = null;
        private void openChildForm(Form childForm)
        {
            if(activeForm != null)
            {
                activeForm.Close();
            }

            activeForm = childForm;
            childForm.TopLevel = false;
            childForm.FormBorderStyle = FormBorderStyle.None;
            childForm.Dock = DockStyle.Fill;
            panelChildForm.Controls.Add(childForm);
            panelChildForm.Tag = childForm;
            childForm.BringToFront();
            childForm.Show();
        }
    
    
    
    
    }
}
