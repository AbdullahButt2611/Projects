                            /*  title
                            project work: CONTRACTORS WORK MANAGEMENT SYSTEM */

#include<iostream>
#include<iomanip>
#include<conio.h>
#include<fstream>
using namespace std;
                    //Function Prototypes
void companyTitle();
void halt();
int scenerio();
char menu();
void quit();
void gray_view();
void finish_view();
void declaration();
void gray_add();
bool nameCheck(string NAME);
bool cntctCheck(string cntct);
bool datecheck(string date);
void finishing_add();
void gray_total(int index);
void finish_total(int index);
void gp_view(int index);
void fp_view(int index);
void gray_edit(int index);
void finish_edit(int index);
void graycomplete(int index);
void finishcomplete(int index);
void grayLoad();
void finishLoad();
void grayStore();
void finishStore();

                    //Variables declaration
const int pro_size=10;                                      //variable for number of projects
const int half_size=pro_size/2;
int project[pro_size];
string customers[pro_size];
int gray[half_size][13];
int finishing[half_size][9];
string contact[10];
string date[10];
string endDate[10];
int total[10]={0};

int main(){                      //main function variables declaration
    int option;
    char MENU;
    char more;

    declaration();
    grayLoad();
    finishLoad(); 
   companyTitle();
   start:
   MENU=menu();
   if(MENU=='s' || MENU=='S')                                       //option to add data into the system
   {
       option=scenerio();
       if(option==1)
       {
           grayaddstart:
           gray_add();
           more:
            cout<<"Do want to add more data of same category(y/n)";
            cin>>more;
            switch(more)
            {
                case 'y':
                case 'Y':
                    halt();
                    goto grayaddstart;
                break;

                case 'n':
                case 'N':
                    system("CLS");
                    goto start;
                break;

                default:
                    cout<<"Undefined input. Try again...";
                    halt();
                    goto more;
                break;
            }
       }
       else if(option==2)
       {
           finaddstart:
           finishing_add();
           cont:
            cout<<"Do want to add more data of same category(y/n)";
            cin>>more;
            switch(more)
            {
                case 'y':
                case 'Y':
                    halt();
                    goto finaddstart;
                break;

                case 'n':
                case 'N':
                    system("CLS");
                    goto start;
                break;

                default:
                    cout<<"Undefined input. Try again...";
                    halt();
                    goto cont;
                break;
            }

       }
   }
   else if(MENU=='e' || MENU=='E')                              //option to edit the entered data
   {
       option=scenerio();
       if(option==1)
       {
           gray_view();
           cout<<"Enter the project number you want to edit:";
           cin>>option;
           option=option-1;
           gp_view(option);
           gray_edit(option);
           goto start;
       }
       else if(option==2)
       {
            finish_view();
           cout<<"Enter the project number you want to edit:";
           cin>>option;
           option=option-1;
           fp_view(option);
           finish_edit(option);
           goto start;
       }
   }
   else if(MENU=='V' || MENU=='v')                 //option to view the main details of project         
   {
       option=scenerio();
       if(option==1)
       {
           gray_view();
           goto start;
       }
       else if(option==2)
       {
           finish_view();
           goto start;
       }
   }
   else if(MENU=='P' || MENU=='p')                          //option to view the detail info related to single project
   {
        option=scenerio();
       if(option==1)
       {
           preview1:
           cout<<"Enter the project number:";
           cin>>option;
           if(option>=1 && option<=5)
           {
               option=option-1;
               gp_view(option);
               goto start;
           }
           else
           {
               cout<<"invalid Project code..input again:"<<endl;
               goto preview1;
           }
       }
       else if(option==2)
       {
           preview2:
           cout<<"Enter the project number:";
           cin>>option;
           if(option>=6 && option<=10)
           {
               option=option-1;
               fp_view(option);
               goto start;
           }
           else
           {
               cout<<"invalid Project code..input again:"<<endl;
               goto preview2;
           }
       }
   }
   else if(MENU=='Q' || MENU=='q')                                      //option to quit the system
   {
       quit();
       goto quit;
   }
   else if(MENU=='N' || MENU=='n')                                      //option to delete the project details
   {
      option=scenerio();
      newcourse:
      if(option==1)
      {
        cout<<"***********************************************************"<<endl;
        cout<<"Congratulations and best wishes for your next project"<<endl;
        cout<<"***********************************************************"<<endl;
        cout<<endl;
        gray_view();
        cout<<"Enter the project number:";
        cin>>option;
        option=option-1;
        graycomplete(option);
        cout<<"The data of this project has successfully deleted......."<<endl;
        halt();
        goto start;
      }
      else if(option==2)
      {
        cout<<"***********************************************************"<<endl;
        cout<<"Congratulations and best wishes for your next project"<<endl;
        cout<<"***********************************************************"<<endl;
        cout<<endl;
        finish_view();
        cout<<"Enter the project number:";
        cin>>option;
        option=option-1;
        finishcomplete(option);
        cout<<"The data of this project has successfully deleted......."<<endl;
        halt();
        goto start;
      }
      else
      {
          cout<<"invalid input........try again:::::::"<<endl;
          goto newcourse;
      }
      
      
   }
   else                                                         //if user inputs anything other than the given menus
   {
       cout<<"Invalid input...."<<endl;
       halt();
       goto start;
        
   }

 quit:
 grayStore();
 finishStore();
 return 0;
}
//function to print the title of the company
void companyTitle()
{
    cout<<"________________________________________________________________________________________________________________________________________________________________________"<<endl;
    cout<<"                                                                       WELCOME TO YOUR SYSTEM"<<endl;
    cout<<"________________________________________________________________________________________________________________________________________________________________________"<<endl;
    cout<<"                                                                       MAX DESIGNS COMPANY"<<endl;
    cout<<"________________________________________________________________________________________________________________________________________________________________________"<<endl;
    cout<<endl;
    cout<< "                      Slogan:"<<endl;
    cout<<"                                                 Helping You To Build Better FORM CONCEPT TO COMPLETION"<<endl;
    cout<<endl;
    halt();
}
//function for halt
void halt()
{
    cout<<"Press any key to continue.............."<<endl;
    getch();
    system("CLS");
}
//function for the two types of projects based on customers choice
int scenerio()
{
    scene:
    int scn;
    cout<<"Select the option in which you want to deal in:"<<endl;
    cout<<" 1) Gray Structure               2)Finishing"<<endl;
    cin>>scn;
    if(scn!=1 && scn!=2)
    {
        cout<<"Invalid input"<<endl;
        halt();
        goto scene;
    }
    else
    {
        cout<<endl;
        halt();
        return scn;
    }
    
}
//function for asking user about work
char menu()
{
    options:
    cout<<"*******************************************************************************************************************************************************************"<<endl;
    cout<<"                                                                      MENU"<<endl;
    cout<<"*******************************************************************************************************************************************************************"<<endl;
    char menu_op;
    cout<<endl;
    cout<<endl;
    cout<<"                             > Enter S if u want to save the details"<<endl;
    cout<<endl;
    cout<<"                             > Enter E if u want to edit some information"<<endl;
    cout<<endl;
    cout<<"                             > Enter V if you want to view the details of projects"<<endl;
    cout<<endl;
    cout<<"                             > Enter P if you want to see the detail of the particular project"<<endl;
    cout<<endl;
    cout<<"                             > Enter N if the project is complete and to delete its info"<<endl;
    cout<<endl;
    cout<<"                             > Enter Q if u want to exit this system"<<endl;
    cin>>menu_op;
          system("CLS");
        return menu_op;
}
//function for exiting the program
 void quit()
 {
     cout<<"Thank you for your services "<<endl;
     cout<<"The system is exiting now"<<endl;
 }
//Function to show projects related to gray structure
 void gray_view()
 {
     cout<<setw(3)<<"No"<<setw(20)<<"Customer Name"<<setw(20)<<"Contact No."<<setw(20)<<"Starting Date"<<setw(20)<<"Promised Date"<<setw(20)<<"Total Amount"<<endl;
     cout<<"**********************************************************************************************************"<<endl;
     for(int i=0;i<half_size;i++)
     {
        if(contact[i]!="-1")
        {
             cout<<setw(3)<<project[i]<<setw(20)<<customers[i]<<setw(20)<<contact[i]<<setw(20)<<date[i]<<setw(20)<<endDate[i]<<setw(20)<<total[i]<<endl;
        }
     }
     cout<<endl;
     cout<<"If you want to look out for a particular project visit the P option in main menu and eneter the project number"<<endl;
    cout<<endl;
    halt();
 }
//function to show the projects related to finish market
 void finish_view()
 {
     cout<<setw(3)<<"No"<<setw(20)<<"Customer Name"<<setw(20)<<"Contact No."<<setw(20)<<"Starting Date"<<setw(20)<<"Promised Date"<<setw(20)<<"Total Amount"<<endl;
     cout<<"****************************************************************************************************************************************************"<<endl;
     for(int i=half_size;i<pro_size;i++)
     {
        if(contact[i]!="-1")
        {
            cout<<setw(3)<<project[i]<<setw(20)<<customers[i]<<setw(20)<<contact[i]<<setw(20)<<date[i]<<setw(20)<<endDate[i]<<setw(20)<<total[i]<<endl;
        }
     }
     cout<<endl;
     cout<<"If you want to look out for a particular project visit the P option in main menu and eneter the project number"<<endl;
     cout<<endl;
     halt();
 }
//function for initializing arrays
 void declaration()
 {
     for(int t=0 ;t<pro_size;t++)
   {
     project[t]=-1;
     customers[t]="-1";
     contact[t]="-1";
     date[t]="-1";
     endDate[t]="-1";
   }
    for(int m=0;m<half_size;m++)
    {
        for(int n=0;n<13;n++)
        {
            gray[m][n]=0;
        }
    }
    for(int l=0;l<half_size;l++)
    {
        for(int k=0;k<9;k++)
        {
            gray[l][k]=0;
        }
    }

 }
            //function for adding data in gray category
 void gray_add()
 {
     string userinfo;
     bool validator;
     int gray_index;
     for(int i=0;i<half_size;i++)
     {
         if(contact[i]=="-1")
         {
            gray_index=i;
            project[i]=i+1;
            break;
         }
     }
        grayname:
            cout<<"Enter the name of the customer"<<endl;
            cin.ignore(100,'\n');
            getline(cin,userinfo);
            validator=nameCheck(userinfo);
            if(validator==true)
            {
                customers[gray_index]=userinfo;
            }
            else
            {
                cout<<"Invalid name.Input agaian"<<endl;
                cout<<endl;
                goto grayname;
            }
        graynum:
            cout<<"Enter contact of the customer"<<endl;
            cin>>userinfo;
            validator=cntctCheck(userinfo);
            if(validator==true)
            {
                contact[gray_index]=userinfo;
            }
            else
            {
                cout<<"Invalid contact number .Input agaian"<<endl;
                cout<<endl;
                goto graynum;
            }
        graysdate:
            cout<<"Enter the starting date (dd-mm-year) of the project"<<endl;
            cin>>userinfo;
            validator=datecheck(userinfo);
            if(validator==true)
            {
                date[gray_index]=userinfo;
            }
            else
            {
                cout<<"Invalid date .Input agaian"<<endl;
                cout<<endl;
                goto graysdate;
            }
        grayedate: 
            cout<<"Enter the promised ending date (dd-mm-year)of the project"<<endl;
            cin>>userinfo;
            validator=datecheck(userinfo);
            if(validator==true)
            {
                endDate[gray_index]=userinfo;
            }
            else
            {
                cout<<"Invalid date .Input agaian"<<endl;
                cout<<endl;
                goto grayedate;
            }
            cout<<"Enter the cost of sand"<<endl;
            cin>>gray[gray_index][0];
            cout<<"Enter the cost of cement"<<endl;
            cin>>gray[gray_index][1];
            cout<<"Enter the cost of bricks"<<endl;
            cin>>gray[gray_index][2];
            cout<<"Enter the cost of steel"<<endl;
            cin>>gray[gray_index][3];
            cout<<"Enter the cost of electrical work"<<endl;
            cin>>gray[gray_index][4];
            cout<<"Enter the cost of sanitary"<<endl;
            cin>>gray[gray_index][5];
            cout<<"Enter the cost of miscellaneous"<<endl;
            cin>>gray[gray_index][6];
            cout<<"Enter the cost of ceiling"<<endl;
            cin>>gray[gray_index][7];
            cout<<"Enter the cost of civil labor"<<endl;
            cin>>gray[gray_index][8];
            cout<<"Enter the cost of sanitary labor"<<endl;
            cin>>gray[gray_index][9];
            cout<<"Enter the cost of steel labor"<<endl;
            cin>>gray[gray_index][10];
            cout<<"Enter the cost of electrical labor"<<endl;
            cin>>gray[gray_index][11];
            cout<<"Enter the cost of ceiling labor"<<endl;
            cin>>gray[gray_index][12];
            gray_total(gray_index);
 }
            //Validator for name
bool nameCheck(string NAME)
{
    bool nflag=false;
    int size=NAME.length();
    for(int n=0;n<size;n++)
    {
        if((NAME[n]>='a' && NAME[n]<='z') || (NAME[n]>='A' && NAME[n]<='Z') || (NAME[n]==' '))
        {
            nflag=true;
        }
        else
        {
            nflag=false;
            break;
        } 
    }
    return nflag;
}
                //contact number validator
bool cntctCheck(string cntct)
{
    bool cflag=false;
    int size=cntct.length();
    if(size==11)
    {
        for(int c=0;c<size;c++)
        {
            if(cntct[c]>='0' && cntct[c]<='9')
            {
                cflag=true;
            }
            else
            {
                cflag=false;
                break;
            }
        }
    }
    else
    {
        cflag=false;
    }
    return cflag;
}
        //date validator
bool datecheck(string date)
{
    bool dflag=false;
    int size=date.length();
    if(size==10)
    {
        if(date[0]>='0' && date[0]<='3')
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
        if(date[1]>='0' && date[1]<='9')
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
        if((date[2]=='-' || date[2]=='/') && (date[5]=='-' || date[5]=='/'))
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
        if(date[3]>='0' && date[3]<='1')
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
        if(date[4]>='0' && date[4]<='9')
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
        if(date[6]=='2' && date[7]=='0' && date[8]=='2')
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
        if(date[9]>='0' && date[9]<='9')
        {
            dflag=true;
        }
        else 
        {
            dflag=false;
            return false;
        }
    }
    else
    {
        dflag=false;
        
    }
   return dflag; 
}
            //function to add data in finishing category
void finishing_add()
{
    string finishinfo;
    int finishindex;
    bool validator=false;
    for(int i=half_size;i<pro_size;i++)
    {
        if(contact[i]=="-1")
        {
            finishindex=i;
            project[i]=i+1;
            break;
        }
    }
    finname:
            cout<<"Enter the name of the customer"<<endl;
            cin.ignore(100,'\n');
            getline(cin,finishinfo);
            validator=nameCheck(finishinfo);
            if(validator==true)
            {
                customers[finishindex]=finishinfo;
            }
            else
            {
                cout<<"Invalid name.Input agaian"<<endl;
                cout<<endl;
                goto finname;
            }
        finnum:
            cout<<"Enter contact of the customer"<<endl;
            cin>>finishinfo;
            validator=cntctCheck(finishinfo);
            if(validator==true)
            {
                contact[finishindex]=finishinfo;
            }
            else
            {
                cout<<"Invalid contact number .Input agaian"<<endl;
                cout<<endl;
                goto finnum;
            }
        finsdate:
            cout<<"Enter the starting date (dd-mm-year) of the project"<<endl;
            cin>>finishinfo;
            validator=datecheck(finishinfo);
            if(validator==true)
            {
                date[finishindex]=finishinfo;
            }
            else
            {
                cout<<"Invalid date .Input agaian"<<endl;
                cout<<endl;
                goto finsdate;
            }
        finedate: 
            cout<<"Enter the promised ending date (dd-mm-year)of the project"<<endl;
            cin>>finishinfo;
            validator=datecheck(finishinfo);
            if(validator==true)
            {
                endDate[finishindex]=finishinfo;
            }
            else
            {
                cout<<"Invalid date .Input agaian"<<endl;
                cout<<endl;
                goto finedate;
            }
            cout<<"Enter the cost of tiles"<<endl;
            cin>>finishing[finishindex-half_size][0];
            cout<<"Enter the cost of witchplates"<<endl;
            cin>>finishing[finishindex-half_size][1];
            cout<<"Enter the cost of lights"<<endl;
            cin>>finishing[finishindex-half_size][2];
            cout<<"Enter the cost of fans"<<endl;
            cin>>finishing[finishindex-half_size][3];
            cout<<"Enter the cost of joinary works"<<endl;
            cin>>finishing[finishindex-half_size][4];
            cout<<"Enter the cost of decor"<<endl;
            cin>>finishing[finishindex-half_size][5];
            cout<<"Enter the cost of wooden labor"<<endl;
            cin>>finishing[finishindex-half_size][6];
            cout<<"Enter the cost of watchman"<<endl;
            cin>>finishing[finishindex-half_size][7];
            cout<<"Enter the cost of paint work"<<endl;
            cin>>finishing[finishindex-half_size][8];
            finish_total(finishindex);
}
            //function to calculate total of gray
void gray_total(int index)
{
    for(int i=0;i<13;i++)
    {
        total[index]=total[index]+gray[index][i];
    }
}
            //function for calculating total of finishing
void finish_total(int index)
{
    for(int i=0;i<9;i++)
    {
        total[index]=total[index]+finishing[index-half_size][i];
    }
}
            //function to show the particular details of a project in gray category:
void gp_view(int index)
{
    cout<<"****************************************************************************************************"<<endl;
    cout<<"                           The details of project no. "<<project[index]<<endl;
    cout<<"****************************************************************************************************"<<endl;
    cout<<"Name of the customer is                                          "<<customers[index]<<endl;
    cout<<"Contact number of the customer is                                "<<contact[index]<<endl;
    cout<<"The starting date of project is :                                "<<date[index]<<endl;
    cout<<"The promised date for completeion of project is :                "<<date[index]<<endl;
    cout<<"The cost of sand is                                              Rs."<<gray[index][0]<<endl;
    cout<<"The cost of cement is `                                          Rs."<<gray[index][1]<<endl;
    cout<<"The cost of bricks is                                            Rs."<<gray[index][2]<<endl;
    cout<<"The cost of steel is                                             Rs."<<gray[index][3]<<endl;
    cout<<"The cost of electrical equipments is                             Rs."<<gray[index][4]<<endl;
    cout<<"The cost of sanitary material is                                 Rs."<<gray[index][5]<<endl;
    cout<<"The cost of miscellaneous is                                     Rs."<<gray[index][6]<<endl;
    cout<<"The cost of ceiling is                                           Rs."<<gray[index][7]<<endl;
    cout<<"The cost of civil labour is                                      Rs."<<gray[index][8]<<endl;
    cout<<"The cost of sanitary labour is                                   Rs."<<gray[index][9]<<endl;
    cout<<"The cost of steel labour is                                      Rs."<<gray[index][10]<<endl;
    cout<<"The cost of electric labour is                                   Rs."<<gray[index][11]<<endl;
    cout<<"The cost of ceiling labour is                                    Rs."<<gray[index][12]<<endl;
    cout<<"The total bill of this project is                                Rs."<<total[index]<<endl;
    cout<<"********************************************************************************************************"<<endl;
    cout<<endl;
    halt();
}
            //function to show details of particular project in finishing category:
void fp_view(int index)
{
    int formal=index-half_size;
    cout<<"************************************************************************************************"<<endl;
    cout<<"                      The details of project no. "<<project[index]<<endl;
    cout<<"************************************************************************************************"<<endl;
    cout<<"Name of the customer is                                      "<<customers[index]<<endl;
    cout<<"Contact number of the customer is                            "<<contact[index]<<endl;
    cout<<"The starting date of project is :                            "<<date[index]<<endl;
    cout<<"The promised date for completeion of project is :            "<<date[index]<<endl;
    cout<<"The cost of the tiles is                                     RS."<<finishing[formal][0]<<endl;
    cout<<"The cost of the witchplates is                               RS."<<finishing[formal][1]<<endl;
    cout<<"The cost of the lights is                                    RS."<<finishing[formal][2]<<endl;
    cout<<"The cost of the fans is                                      RS."<<finishing[formal][3]<<endl;
    cout<<"The cost of the joinary works is                             RS."<<finishing[formal][4]<<endl;
    cout<<"The cost of the decor is                                     RS."<<finishing[formal][5]<<endl;
    cout<<"The cost of the wood labour is                               RS."<<finishing[formal][6]<<endl;
    cout<<"The cost of the watchman is                                  RS."<<finishing[formal][7]<<endl;
    cout<<"The cost of the paint work is                                RS."<<finishing[formal][8]<<endl;
    cout<<"The total bill of this project is                            Rs."<<total[index]<<endl;
    cout<<"************************************************************************************************"<<endl;
    cout<<endl;
    halt();
}
            //function to edit in gray category
void gray_edit(int index)
{
    total[index]=0;
    bool isvalidinput=false;
    string check;
    char choice;
    cout<<"Do you want to edit the name of the customer(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        gename:
        cout<<"Enter the name of the customer:";
        cin.ignore();
        getline(cin,check);
        isvalidinput=nameCheck(check);
        if(isvalidinput==true)
        {
            customers[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto gename;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the contact of the customer(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        gecntct:
        cout<<"Enter the contact of the customer:";
        cin>>check;
        isvalidinput=cntctCheck(check);
        if(isvalidinput==true)
        {
            contact[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto gecntct;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the starting date of the customer project(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        gesdate:
        cout<<"Enter the starting date of the customer project:";
        cin>>check;
        isvalidinput=datecheck(check);
        if(isvalidinput==true)
        {
            date[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto gesdate;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the promised ending date  of the customer project(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        geedate:
        cout<<"Enter the ending date of the customer project:";
        cin>>check;
        isvalidinput=datecheck(check);
        if(isvalidinput==true)
        {
            endDate[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto geedate;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of sand (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][0];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of cement (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][1];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of bricks (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][2];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of steel (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][3];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of electrical equipments (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][4];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of sanitar equipments (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][5];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of miscellaneous (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][6];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of ceiling (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][7];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of civil labour (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][8];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of sanitary labour (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][9];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of steel labour (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][10];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of electrical labour (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][11];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of ceiling labour (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>gray[index][12];
    }
    for(int i=0;i<13;i++)
    {
        total[index]=total[index]+gray[index][i];
    }
    halt();
}
            //function to edit the finishing structure data
void finish_edit(int index)
{
    total[index]=0;
    bool isvalidinput=false;
    string check;
    char choice;
    cout<<"Do you want to edit the name of the customer(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        fename:
        cout<<"Enter the name of the customer:";
        cin.ignore();
        getline(cin,check);
        isvalidinput=nameCheck(check);
        if(isvalidinput==true)
        {
            customers[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto fename;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the contact of the customer(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        fecntct:
        cout<<"Enter the contact of the customer:";
        cin>>check;
        isvalidinput=cntctCheck(check);
        if(isvalidinput==true)
        {
            contact[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto fecntct;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the starting date of the customer project(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        fesdate:
        cout<<"Enter the starting date of the customer project:";
        cin>>check;
        isvalidinput=datecheck(check);
        if(isvalidinput==true)
        {
            date[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto fesdate;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the promised ending date  of the customer project(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        feedate:
        cout<<"Enter the ending date of the customer project:";
        cin>>check;
        isvalidinput=datecheck(check);
        if(isvalidinput==true)
        {
            endDate[index]=check;
        }
        else 
        {
            cout<<"invalid input..try again"<<endl;
            goto feedate;
        }
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of tiles (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][0];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of witchplates (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][1];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of lights (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][2];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of fans (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][3];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of joinary works (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][4];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of decor(y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][5];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of wood labour (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][6];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of watchman (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][7];
    }
    cout<<endl;
    cout<<"Do you want to edit the cost of paint work (y/n)";
    cin>>choice;
    if(choice=='y' || choice=='Y')
    {
        cout<<"Enter the cost:";
        cin>>finishing[index-half_size][8];
    }

    for(int i=0;i<9;i++)
    {
        total[index]=total[index]+finishing[index-half_size][i];
    }
    halt();
}
                //function to delete the data if the project is complete:
void graycomplete(int index)
{
    project[index]=-1;
    customers[index]="-1";
    contact[index]="-1";
    date[index]="-1";
    endDate[index]="-1";
    for(int i=0;i<13;i++)
    {
        gray[index][i]=0;
    }
    total[index]=0;
    halt();
}
            //function to delete the data if project is completein finish category
void finishcomplete(int index)
{
    project[index]=-1;
    customers[index]="-1";
    contact[index]="-1";
    date[index]="-1";
    endDate[index]="-1";
    for(int i=0;i<9;i++)
    {
        finishing[index-half_size][i]=0;
    }
    total[index]=0;
    halt();
}
        //function to load data form gray sector file to program
void grayLoad()
{
    ifstream grd;
    grd.open("gray.txt");
    int i=0;
    int sum;
    while (!grd.eof() && i<half_size)
    {
        sum=0;
        project[i]=i+1;
        
        getline(grd,customers[i]);
        getline(grd,contact[i]);
        getline(grd,date[i]);
        getline(grd,endDate[i]);
        for(int j=0;j<13;j++)
        {
            grd>>gray[i][j];
            sum=sum+gray[i][j];
        }
        total[i]=sum;
        i++;
        grd.ignore();
        
    }
    grd.close();
}
            //function to load data from finishing sector file to program
void finishLoad()
{
    ifstream fin;
    fin.open("finish.txt");
    int i=half_size;
     int sum;
    while (!fin.eof() && i<pro_size)
    {
       sum=0;
        project[i]=i+1;
        
        getline(fin,customers[i]);
        getline(fin,contact[i]);
        getline(fin,date[i]);
        getline(fin,endDate[i]);
        for (int j = 0; j < 9; j++)
        {
            fin>>finishing[i-half_size][j];
            sum=sum+finishing[i-half_size][j];
        }
        total[i]=sum;
        i++;
        fin.ignore();
        
    } 
    fin.close();
} 
                //function to save dta to gray sector file
void grayStore()
{
    ofstream grst;
    grst.open("gray.txt");
    for(int i=0;i<half_size;i++)
    {
        if(contact[i]!="-1")
        {
            grst<<customers[i]<<endl;
            grst<<contact[i]<<endl;
            grst<<date[i]<<endl;
            grst<<endDate[i]<<endl;
            for(int j=0;j<13;j++)
            {
                grst<<gray[i][j]<<endl;
            }
        }
    }
    grst.close();
}
                //function to save dta to finishing sector file
void finishStore()
{
    ofstream finst;
    finst.open("finish.txt");
    for(int i=half_size;i<pro_size;i++)
    {
        if(contact[i]!="-1")
        {
            finst<<customers[i]<<endl;
            finst<<contact[i]<<endl;
            finst<<date[i]<<endl;
            finst<<endDate[i]<<endl;
            for(int j=0;j<9;j++)
            {
                finst<<finishing[i-half_size][j]<<endl;
            }
        }
    }
    finst.close();
} 