using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using FontAwesome.Sharp;
using System.Runtime.InteropServices;

namespace Shopping_Mall
{
    public partial class Form1 : Form
    {
        //fields
        private IconButton currentBtn;
        private Panel leftBorderBtn;
        private Form currentChildform;

        //Structs
        private struct RGBColor{
            public static Color color1 = Color.FromArgb(172,126,241);
            public static Color color2 = Color.FromArgb(249,118,176);
            public static Color color3 = Color.FromArgb(253,138,114);
            public static Color color4 = Color.FromArgb(95,77,221);
            public static Color color5 = Color.FromArgb(249,88,155);
            public static Color color6 = Color.FromArgb(24,161,251);

        }

        public Form1()
        {
            InitializeComponent();
            leftBorderBtn = new Panel();
            leftBorderBtn.Size = new Size(7,60);
            panelMenu.Controls.Add(leftBorderBtn);

            this.Text = String.Empty;
            this.ControlBox = false;
            this.DoubleBuffered = true;
            this.MaximizedBounds = Screen.FromHandle(this.Handle).WorkingArea;
        }


        //Methods
        private void ActivateButton(object SenderBtn, Color color)
        {
            if(SenderBtn!=null)
            {
                DisableBtn();
                currentBtn = (IconButton)SenderBtn;
                currentBtn.BackColor = Color.FromArgb(37, 36, 81);
                currentBtn.ForeColor = color;
                currentBtn.TextAlign = ContentAlignment.MiddleCenter;
                currentBtn.IconColor = color;
                currentBtn.TextImageRelation = TextImageRelation.TextBeforeImage;
                currentBtn.ImageAlign = ContentAlignment.MiddleRight;
                leftBorderBtn.BackColor = color;
                leftBorderBtn.Location = new Point(0,currentBtn.Location.Y);
                leftBorderBtn.Visible = true;
                leftBorderBtn.BringToFront();

                IconCurrentChildform.IconChar = currentBtn.IconChar;
                IconCurrentChildform.IconColor = color;
            }
        }

        private void DisableBtn()
        {
            if(currentBtn!= null)
            {
                currentBtn.BackColor = Color.FromArgb(31,30,68);
                currentBtn.ForeColor = Color.Gainsboro;
                currentBtn.TextAlign = ContentAlignment.MiddleLeft;
                currentBtn.IconColor = Color.Gainsboro;
                currentBtn.TextImageRelation = TextImageRelation.ImageBeforeText;
                currentBtn.ImageAlign = ContentAlignment.MiddleLeft;
            }
        }

        private void btnDashboard_Click(object sender, EventArgs e)
        {
            ActivateButton(sender,RGBColor.color1);

            openChildform(new FormDashboard());
        }

        private void btnOrders_Click(object sender, EventArgs e)
        {
            ActivateButton(sender, RGBColor.color2);

            openChildform(new FormOrders());
        }

        private void btnProducts_Click(object sender, EventArgs e)
        {
            ActivateButton(sender, RGBColor.color3);

            openChildform(new FormProducts());
        }

        private void btnCustomers_Click(object sender, EventArgs e)
        {
            ActivateButton(sender, RGBColor.color4);

            openChildform(new FormCustomers());
        }

        private void btnMarket_Click(object sender, EventArgs e)
        {
            ActivateButton(sender, RGBColor.color5);

            openChildform(new FormMarketting());
        }

        private void btnSettings_Click(object sender, EventArgs e)
        {
            ActivateButton(sender, RGBColor.color6);

            openChildform(new FormSettings());
        }

        private void btnHome_Click(object sender, EventArgs e)
        {
            currentChildform.Close();
            Reset();
        }

        private void Reset()
        {
            DisableBtn();
            leftBorderBtn.Visible = false;

            IconCurrentChildform.IconChar = IconChar.Home;
            IconCurrentChildform.IconColor = Color.MediumPurple;
            labelTitleCjildForm.Text = "Home";
        }


        [DllImport("user32.DLL", EntryPoint = "ReleaseCapture")]
        private extern static void ReleaseCapture();

        [DllImport("user32.DLL", EntryPoint = "SendMessage")]
        private extern static void SendMessage(System.IntPtr hWnd, int wMsg, int wParam, int lParam);

        private void panelTitleBar_MouseDown(object sender, MouseEventArgs e)
        {
            ReleaseCapture();
            SendMessage(this.Handle, 0x112, 0xf012, 0);
        }
        

        private void openChildform(Form childForm)
        {
            if(currentChildform!=null)
            {
                currentChildform.Close();
            }

            currentChildform = childForm;
            childForm.TopLevel = false;
            childForm.FormBorderStyle = FormBorderStyle.None;
            childForm.Dock = DockStyle.Fill;

            panelDesktop.Controls.Add(childForm);
            panelDesktop.Tag = childForm;
            childForm.BringToFront();
            childForm.Show();
            labelTitleCjildForm.Text = childForm.Text; 
        }

        private void label1_Click(object sender, EventArgs e)
        {
            if (label1.Text == "Alphabeticall arrangment")
            {
                Console.WriteLine("We are not eligible to post this thing here");
            }
            else
            {
                Console.WriteLine("All the data corresponding to this relation is eligible");
            }
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }
    }
}
