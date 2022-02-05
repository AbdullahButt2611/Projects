using System;

namespace Driver
{
    class Program
    {
        static bool validDividend(double a, double b)
        {
            if (a == 0.0 && b == 0.0)
            {
                return false;
            }
            return true;
        }

        static void Main(string[] args)
        {
            // Console.WriteLine("Hello World!");
            String op;                      //taking option input from GUI
            int option = -1;                  //comverting that inputted value in the string
            do
            {
                //                basic code for inputting the option value from user
                String message = "**************************************************************************************\n                          WELCOME TO COMPLEX WORLD\n**************************************************************************************";
                Console.WriteLine(message);
                Console.WriteLine("Choose on of the Following Inputs: \n 1-For adding two Complex Numbers \n 2-For subtracting two complex numbers \n 3-For Multiplying two complex numbers \n 4-For dividing two Complex Numbers \n 5-For Sin() of a Complexnumber \n 6-For Cos() of a complex number \n 7-For Tan() of a complex number\n 8-For finding the conjugate of complex number\n9-For finding he absolute value of complex Number \n 0-To exit of the system");
                op = Console.ReadLine();
                option = Convert.ToInt32(op);
                while (option < 0 || option > 9)
                {
                    Console.WriteLine("You have Entered an invalid input \n Try again with a avlid input");
                    Console.WriteLine("**************************************************************************************\n                          WELCOME TO COMPLEX WORLD\n**************************************************************************************");
                    Console.WriteLine("Choose on of the Following Inputs: \n 1-For adding two Complex Numbers \n 2-For subtracting two complex numbers \n 3-For Multiplying two complex numbers \n 4-For dividing two Complex Numbers \n 5-For Sin() of a Complexnumber \n 6-For Cos() of a complex number \n 7-For Tan() of a complex number\n 8-For finding the conjugate of complex number\n9-For finding he absolute value of complex Number \n 0-To exit of the system");
                    op=Console.ReadLine();
                    option = Convert.ToInt32(op);
                }
                if (option == 1) //for adddition
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    Console.WriteLine("Enter The Second Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input= Console.ReadLine();
                    real = 0.0;
                    imaginary = 0.0;
                    String[] splitArray = input.Split(",");
                    real = Convert.ToDouble(splitArray[0]);
                    imaginary = Convert.ToDouble(splitArray[1]);
                    ComplexNumber c2 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1 + c2;
                    Console.WriteLine("   " + c1.toString() + "\n+ " + c2.toString() + "\n______________________" + "\n   " + c.toString());
                }
                else if (option == 2)   //for subtraction
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    Console.WriteLine("Enter The Second Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    real = 0.0;
                    imaginary = 0.0;
                    String[] splitArray = input.Split(",");
                    real = Convert.ToDouble(splitArray[0]);
                    imaginary = Convert.ToDouble(splitArray[1]);
                    ComplexNumber c2 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1-c2;
                    Console.WriteLine("   " + c1.toString() + "\n- " + c2.toString() + "\n______________________" + "\n   " + c.toString());
                }
                else if (option == 3) //for multiplication
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    Console.WriteLine("Enter The Second Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    real = 0.0;
                    imaginary = 0.0;
                    String[] splitArray = input.Split(",");
                    real = Convert.ToDouble(splitArray[0]);
                    imaginary = Convert.ToDouble(splitArray[1]);
                    ComplexNumber c2 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1*c2;
                    Console.WriteLine("   " + c1.toString() + "\nX " + c2.toString() + "\n______________________" + "\n   " + c.toString());
                    Console.WriteLine("   " + c1.toString() + "\nX " + c2.toString() + "\n______________________" + "\n   " + c.toString());
                }
                else if (option == 4) //for division
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    Console.WriteLine("Enter The Second Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    real = 0.0;
                    imaginary = 0.0;
                    String[] splitArray = input.Split(",");
                    real = Convert.ToDouble(splitArray[0]);
                    imaginary = Convert.ToDouble(splitArray[1]);
                    bool flag = validDividend(real, imaginary);
                    while (flag != true)
                    {

                        Console.WriteLine("Enter The Second Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                        input = Console.ReadLine();
                        real = 0.0;
                        imaginary = 0.0;
                        String[] splitArray1 = input.Split(",");
                        real = Convert.ToDouble(splitArray1[0]);
                        imaginary = Convert.ToDouble(splitArray1[1]);
                        flag = validDividend(real, imaginary);
                    }
                    ComplexNumber c2 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1 / c2;
                    Console.WriteLine( c1.toString() + " / " + c2.toString() + " = " + c.toString());
                }
                else if (option == 5)   //for sin()
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1.Sin();
                    Console.WriteLine("Sin( " + c1.toString() + " ) = " + c.toString());
                }
                else if (option == 6)   //for Cos()
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1.Cos();
                    Console.WriteLine("Cos( " + c1.toString() + " ) = " + c.toString());
                }
                else if (option == 7)  //for tan()
                {
                    String input = "";
                    Console.WriteLine("Enter The First Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c1 = new ComplexNumber(real, imaginary);
                    ComplexNumber c = c1.Tan();
                    Console.WriteLine("Tan( " + c1.toString() + " ) = " + c.toString());
                }
                else if (option == 8)    //for Conjuate
                {
                    String input = "";
                    Console.WriteLine("Enter The Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c = new ComplexNumber(real, imaginary);
                    Console.WriteLine("The Conjugate of the complex number " + c.toString() + " is :" + c.conjugate());
                }
                else if (option == 9)  //for abs value
                {
                    String input = "";
                    Console.WriteLine("Enter The Complex Number with rea and imaginary parst seperated by , as (real,imaginary)");
                    input = Console.ReadLine();
                    double real = 0.0;
                    double imaginary = 0.0;
                    String[] splitArr = input.Split(",");
                    real = Convert.ToDouble(splitArr[0]);
                    imaginary = Convert.ToDouble(splitArr[1]);
                    ComplexNumber c = new ComplexNumber(real, imaginary);
                    //                    System.out.println(c.getReal() +"  "+c.getImg());
                    Console.WriteLine("The Absolute value of the Complex Number " + c.toString() + " is :" + c.abs());
                }

            }
            while (option != 0);
            Console.WriteLine("Thank you for using our system \n I hope that you Enjoyed it\n The system is shutting down now");
        }
    }
}
