using System;
using System.Collections.Generic;
using System.Text;

namespace Driver
{
    class ComplexNumber
    {
        /**
     * This is the member of the class ComplexNumber the holds the real 
     * part of the complex number (without i)
     */
        private double real;

        /**
         * This is the member of the class ComplexNumber the holds the imaginary
         * part of complex number (Specifically with i - iota)
         */
        private double img;

        /**
         * This a default constructor it will automatically initialize the data members
         */
        public ComplexNumber()
        {
        }

        /**
         * This is the parametrized constructor for the complexNumber Class
         * @param real the real number,Re(z) for the complex number
         * @param img the imaginary number,Img(z) for the complex number
         */
        public ComplexNumber(double real, double img)
        {
            this.real = real;
            this.img = img;
        }

        /**
         * This a getter for the real part of the Complex number  
         * @return double which will be a double value
         */
        public double getReal()
        {
            return this.real;
        }

        /**
         * This is a getter for imaginary part of the complex number
         * @return double which will be the double value representing imaginary part
         */
        public double getImg()
        {
            return this.img;
        }

        /**
         * This is a function that adds up the complex numbers one of the input is present inside the class and the
         * other one is passed as a parameter
         * @param c this is a reference to the class of the ComplexNumber with the help of which we will be
         * able to get the other input
         * @return ComplexNumber giving out the sum of the complex number
         */
        public static ComplexNumber operator +(ComplexNumber c1,ComplexNumber c2)
        {
            return new ComplexNumber(c1.real + c2.real, c1.img + c2.img);
        }


        /**
         * This is a method that subtracts two complex numbers in which one of the input which are to be subtracted
         * are taken from inside the class using .this statement
         * @param c this is a reference that will point to the second complex number which is
         * needed to perform the action smoothly
         * @return ComplexNumber whixh gives a complete new complete number
         */
        public static ComplexNumber operator -(ComplexNumber c1, ComplexNumber c2)
        {
            return new ComplexNumber(c1.real - c2.real, c1.img - c2.img);
        }

        /**
         * This is a method for multiplying two complex numbers tsking one of the input form 
         * within the class using this while the other is passed as a parameter
         * @param c this is the reference to the ComplexNumber class which will access the second input
         * @return ComplexNumber returning the complete complex number after calculation
         */
        public static ComplexNumber operator *(ComplexNumber c1,ComplexNumber c2)
        {
            double tempReal = c1.real * c2.real - c1.img * c2.img;
            double imaginary = c1.real * c2.img + c1.img * c2.real;
            return new ComplexNumber(tempReal, imaginary);
        }

        /**
         * This is method which helps us in inverting the sign of the imaginary part
         * of the complex number which later on help helps in dividing the complex number
         * which is going to be multiplied with the real complex number
         * @return ComplexNumber which will return a complex complex number but the conjugate of the input
         */
        public ComplexNumber conjugate()
        {
            return new ComplexNumber(this.real, -this.img);
        }

        /**
         * This is a helping method which will give a complex number but its value
         * will be the square of the real and imaginary part
         * @return double which will be the sum of the square of the real and imaginary parts 
         */
        public double square()
        {
            double answer = this.real * this.real + this.img * this.img;
            return answer;
        }

        /**
         * this is also a helping method in which it returns the square root of the
         * square() function which will be helpful in the divide function
         * @return 
         */
        public double abs()
        {
            double answer = Math.Sqrt(this.square());
            return answer;
        }

        /**
         * The basic method which will be there to divide the complex numbers and then 
         * return the Complex number with equal ease as before
         * @param c this will be the reference to the class which will help in
         * accessing the second complex number
         * @return ComplexNumber which rarely helps in greater definition of the complex number
         */
        public static ComplexNumber operator /(ComplexNumber c1,ComplexNumber c2)
        {
            ComplexNumber temp = c1*c2.conjugate();
            double dividend = c2.abs() * c2.abs();
            double tempReal = temp.real / dividend;
            double imaginary = temp.img / dividend;
            return new ComplexNumber(tempReal, imaginary);
        }

        /**
         * This method is used to return the String representation of the 
         * Complex Number
         * @return String which will be a complete complex number
         */
        public String toString()
        {
            String first = Convert.ToString(this.real);//String.Format("%.2f",this.real);
            String second = "";
            double tempImg = Math.Abs(this.img);
            String toImg = Convert.ToString(tempImg);//String.Format("%.2f", tempImg);
            if (this.img > 0)
            {
                second = "+" + toImg + "i";
            }
            else
            {
                second = "-" + toImg + "i";
            }
            first = first + second;
            return first;
        }

        /**
         * This is a method for calculating the sin function of the complex number
         * @return ComplexNumber giving out a complete complex number 
         */
        public ComplexNumber Sin()
        {
            return new ComplexNumber(Math.Sin(this.real) * Math.Cosh(this.img), Math.Cos(this.real) * Math.Sinh(this.img));
        }

        /**
         * This is a method for calculating the Cos function of the complex number
         * @return ComplexNumber giving out a complete complex number 
         */
        public ComplexNumber Cos()
        {
            return new ComplexNumber(Math.Cos(this.real) * Math.Cosh(this.img), -Math.Sin(this.real) * Math.Sinh(this.img));
        }

        /**
         * This is a method for calculating the Tan function of the complex number
         * @return ComplexNumber giving out a complete complex number
         */
        public ComplexNumber Tan()
        {
            return this.Sin()/this.Cos();
        }
    }
}
