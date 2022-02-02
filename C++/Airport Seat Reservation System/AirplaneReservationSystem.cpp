#include<iostream>
#include<conio.h>
#include<iomanip>
#include<string>
#include<fstream>
using namespace std;

char Seat[13][6];

string tag()
{
    string Tag = "";
    Tag = "**************************************************************************************************************\n";
    Tag +="                                    Pakistan International Airlines\n";
    Tag +="**************************************************************************************************************\n\n";
    return Tag;
}

string getRowName(int index)
{
    index += 1;
    // cout<<"The index is "<<to_string(index)<<endl;
    if (index<10)
        return to_string(index);
    else if (index == 10)
        return "A";
    else if (index == 11)
        return "B";
    else if (index == 12)
        return "C";
    else if (index == 13)
        return "D";
    return 0;
}

void newFlight()
{
    for(int i = 0;i<13;i++)
    {
        for(int j=0;j<6;j++)
        {
            Seat[i][j] = '*';
        }
    }
}

void printSeats(int start,int end)
{
    system("CLS");
    cout<<tag();
    cout<<setw(26)<<"Rows"<<setw(10)<<"A"<<setw(10)<<"B"<<setw(10)<<"C"<<setw(10)<<"D"<<setw(10)<<"E"<<setw(10)<<"F"<<endl<<endl;
    for(int i = start-1;i<end;i++)
    {
        cout<<setw(25)<<"Row-"<<getRowName(i);
        for(int j=0;j<6;j++)
        {
            cout<<setw(10)<<Seat[i][j];
        }
        cout<<endl;
    }
}

void WriteFile()
{
    fstream myfile;
    myfile.open("AirplaneData.txt",ios::out);
    for(int i = 0;i<13;i++)
    {
        for(int j = 0;j<6;j++)
        {
            myfile<<Seat[i][j];
        }

        if(i!=12)
            myfile<<endl;
    }
    cout<<"Data Stored Successfully..."<<endl;
    myfile.close();

}

int MainMenu()
{
    int option;
    system("CLS");
    cout<<tag();
    cout<<"Enter the Following Number in Order to Access Your Desired Menu\n";
    cout<<"1.   For Booking a Seat\n";
    cout<<"2.   New Fight\n";
    cout<<"0.   Exit\n";
    cout<<"\nChoose Here _ ";
    cin>>option;
    return option;

}

void ReadFile()
{
    string dataRetrieved;
    fstream myfile;
    myfile.open("AirplaneData.txt",ios::in);
    int index = 0;
    while(!myfile.eof())
    {
        getline(myfile,dataRetrieved);
        int size = dataRetrieved.length();
        for(int j=0;j<size;j++)
        {
            Seat[index][j] = dataRetrieved[j];
        }
        index++;
    }
    myfile.close();
}

int ticketMenu()
{
    int option;
    system("CLS");
    cout<<tag();
    cout<<"Choose your Class According to your ease.\n";
    cout<<"1.   For First Class\n";
    cout<<"2.   For Business Class\n";
    cout<<"3.   For Economy Class\n";
    cout<<"4.   For Cancel Booking\n";
    cout<<"\nEnter the Option _";
    cin>>option;
    return option;
}


bool seatBooked(int row,int column)
{
    if(Seat[row-1][column-1] == 'X')
        return false;
    else
    {
        Seat[row][column] = 'X';
        cout<<"\n"<<Seat[row-1][column-1]<<endl;
        return true;
    }
}

int main()
{
    
    int option;
    ReadFile();
    option = MainMenu();
    while(option<0 || option>2)
    {
        cout<<"\nYou have Entered an Invalid Option\nTry Again with a Valid One\n";
        cout<<"Press any key to go to the Menu";
        getch();
        option = MainMenu();
    }

    while(option != 0)
    {
        system("CLS");

        if(option == 1)
        {
            printSeats(1,13);
            getch();
            int classOption;
            int column;
            int row;
            classOption = ticketMenu();
            while(classOption <1 || classOption>4)
            {
                system("CLS");
                cout<<tag();
                cout<<"\nYou have Entered Invalid Input\nTry Again with a Valid One\n";
                cout<<"Press Any Key to move Back to Menu.";
                getch();
                classOption = ticketMenu();
            }

            if(classOption == 1)
            {
                printSeats(1,2);
                cout<<"\n\nEnter the Seat's Row Number : ";
                cin>>row;

                while(row<1 || row>2)
                {
                    printSeats(1,2);
                    cout<<"\n\nYou have Entered Invalid Input\nTry Again With a Valid Input\n";
                    getch();
                    printSeats(1,2);
                    cout<<"\n\nEnter the Seat's Row Number : ";
                    cin>>row;
                }
                cout<<"\n\nEnter the Seat's Column Number : ";
                cin>>column;
                while(column<1 || column>6)
                {
                    printSeats(1,2);
                    cout<<"\n\nYou have Entered Invalid Input\nTry Again With a Valid Input\n";
                    getch();
                    printSeats(1,2);
                    cout<<"\n\nEnter the Seat's Column Number : ";
                    cin>>column;
                }

                bool flag = seatBooked(row,column);
                if(flag)
                {
                    system("CLS");
                    cout<<tag();
                    cout<<"You Seat has been Reserved at Row-"<<row<<" and Column-"<<column<<endl;
                    cout<<"Have a Safe Journey!\n";
                    cout<<"Press any key to confirm the seat..";
                    getch();
                    printSeats(1,2);
                    getch();
                }
                else
                {
                    system("CLS");
                    cout<<tag();
                    cout<<"This Seat is already Reserved at Row-"<<row<<" and Column-"<<column<<endl;
                    cout<<"Kindly Chose another Seat"<<endl;
                    getch();
                }
                
            }
            else if(classOption == 2)
            {
                 printSeats(3,7);
                cout<<"\n\nEnter the Seat's Row Number : ";
                cin>>row;

                while(row<3 || row>7)
                {
                    printSeats(1,2);
                    cout<<"\n\nYou have Entered Invalid Input\nTry Again With a Valid Input\n";
                    getch();
                    printSeats(3,7);
                    cout<<"\n\nEnter the Seat's Row Number : ";
                    cin>>row;
                }
                cout<<"\n\nEnter the Seat's Column Number : ";
                cin>>column;
                while(column<1 || column>6)
                {
                    printSeats(3,7);
                    cout<<"\n\nYou have Entered Invalid Input\nTry Again With a Valid Input\n";
                    getch();
                    printSeats(3,7);
                    cout<<"\n\nEnter the Seat's Column Number : ";
                    cin>>column;
                }

                bool flag = seatBooked(row,column);
                if(flag)
                {
                    system("CLS");
                    cout<<tag();
                    cout<<"You Seat has been Reserved at Row-"<<row<<" and Column-"<<column<<endl;
                    cout<<"Have a Safe Journey!\n";
                    cout<<"Press any key to confirm the seat..";
                    getch();
                    printSeats(3,7);
                    getch();
                }
                else
                {
                    system("CLS");
                    cout<<tag();
                    cout<<"This Seat is already Reserved at Row-"<<row<<" and Column-"<<column<<endl;
                    cout<<"Kindly Chose another Seat"<<endl;
                    getch();
                }
            }
            else if(classOption == 3)
            {
                 printSeats(8,13);
                cout<<"\n\nEnter the Seat's Row Number : ";
                cin>>row;

                while(row<8 || row>13)
                {
                    printSeats(8,13);
                    cout<<"\n\nYou have Entered Invalid Input\nTry Again With a Valid Input\n";
                    getch();
                    printSeats(8,13);
                    cout<<"\n\nEnter the Seat's Row Number : ";
                    cin>>row;
                }
                cout<<"\n\nEnter the Seat's Column Number : ";
                cin>>column;
                while(column<1 || column>6)
                {
                    printSeats(8,13);
                    cout<<"\n\nYou have Entered Invalid Input\nTry Again With a Valid Input\n";
                    getch();
                    printSeats(8,13);
                    cout<<"\n\nEnter the Seat's Column Number : ";
                    cin>>column;
                }

                bool flag = seatBooked(row,column);
                if(flag)
                {
                    system("CLS");
                    cout<<tag();
                    cout<<"You Seat has been Reserved at Row-"<<row<<" and Column-"<<column<<endl;
                    cout<<"Have a Safe Journey!\n";
                    cout<<"Press any key to confirm the seat..";
                    getch();
                    printSeats(8,13);
                    getch();
                }
                else
                {
                    system("CLS");
                    cout<<tag();
                    cout<<"This Seat is already Reserved at Row-"<<row<<" and Column-"<<column<<endl;
                    cout<<"Kindly Chose another Seat"<<endl;
                    getch();
                }
            }
            else if(classOption == 4)
            {
                system("CLS");
                cout<<tag();
                cout<<"Booking has been Cacelled..";
                getch();
            }
            WriteFile();
        }
        else
        {
            cout<<tag();
            newFlight();
            WriteFile();
            cout<<"New Flight is ready to be Served\n";
            cout<<"Press any Key to Continue..";
            getch();
        }

        option = MainMenu();
        while(option<0 || option>2)
        {
            cout<<"\nYou have Entered an Invalid Option\nTry Again with a Valid One\n";
            cout<<"Press any key to go to the Menu";
            getch();
            option = MainMenu();
        }
    }

    system("CLS");
    WriteFile();
    cout<<tag();
    cout<<"The System is Logging Out\n";
    cout<<"Saving All the Necessary Details..\n";
    cout<<"13% Completed..\n";
    cout<<"53% Completed..\n";
    cout<<"100% Completed..\n";
    cout<<"Data Saved Successfully\n";
    cout<<"Press Any key to Continue _ \n";
    getch();
    system("CLS");
    
    return 0;
}