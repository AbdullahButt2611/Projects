/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.util.Random;

/**
 *
 * @author DEll
 */
public class Employee {
    
    private String ID;
    
    private String name;
    
    private String email;
    
    private String gender;
    
    private int age;
    
    private String status;
    
    private int Salary;
    
    private String Contact;
    
    private String dateJoined;
    
    public Employee()
    {}
    
    public Employee(String gender,int age,String status)
    {
        this.gender = gender;
        this.status = status;
        this.age = age;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                    //File Handling
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setFID(String ID) {
        this.ID = ID;
    }

    public void setFName(String name) {
        this.name = name;
    }

    public void setFEmail(String email) {
        this.email = email;
    }

    public void setFGender(String gender) {
        this.gender = gender;
    }

    public void setFAge(int age) {
        this.age = age;
    }

    public void setFStatus(String status) {
        this.status = status;
    }

    public void setFSalary(int Salary) {
        this.Salary = Salary;
    }

    public void setFContact(String Contact) {
        this.Contact = Contact;
    }

    public void setFDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                // Getter
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public int getSalary() {
        return Salary;
    }

    public String getContact() {
        return Contact;
    }

    public String getDateJoined() {
        return dateJoined;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void setID()
    {
        String id = "W-";
        
        Random rand = new Random();
        for(int i=0;i<4;i++)
        {
            id+=rand.nextInt(10);
        }
        this.ID = id;
    }
    
    public boolean setName(String name)
    {
        int size = name.length();
        boolean flag=false;
        
        for(int i =0;i<size;i++)
        {
            if((name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)==' '))
            {
                flag = true;
            }
            else
                return false;
        }
        this.name = name;
        return flag;
        
    }
    
    public boolean setContact(String contact) {
        int size=contact.length();
        boolean flag=false;
        if(size==11)
        {
            for(int i =0;i<size;i++)
            {
                if(contact.charAt(i)>='0' && contact.charAt(i)<='9')
                    flag=true;
                else
                    return false;
            } 
            this.Contact=contact;
            return flag;
        }
        else
            return false;
        
//        this.contact=contact;
//        return flag;
    }
    
    public boolean setEmail(String email) {
        int size=email.length();
        boolean flag=false;
        int i=0;
        while(i<size && email.charAt(i)!='@')
        {
            if((email.charAt(i)>='A' && email.charAt(i)<='Z')||(email.charAt(i)>='a' && email.charAt(i)<='z')||(email.charAt(i)>='0' && email.charAt(i)<='9'))
            {
                flag=true;
                i++;
            }
            else
                return false;
        }
        if(i<size-1)
            i++;
        
        String rest="";
        for(int j=i;j<size;j++)
        {
            rest+=email.charAt(j);
        }
        
        if(rest.equals("gmail.com") || rest.equals("yahoo.com") || rest.equals("hotmail.com"))
            flag=true;
        else
            return false;
        
        this.email=email;
        return flag;
            
    }
    
    
    public boolean setSalary(int salary)
    {
        if(salary > 0)
        {
            this.Salary = salary;
            return true;
        }
        else
            return false;
    }
    
    public boolean setDate(String date)
    {
        this.dateJoined = date;
        return true;
    }
      
    public boolean isDigits(String data)
    {
        boolean flag = true;
        int size = data.length();
        for(int i =0 ;i<size;i++)
        {
            if(data.charAt(i)>='0' && data.charAt(i)<'9')
            {
                flag =true;
            }
            else
                return false;
        }
        
        return flag;
    }
    
    
    
    
    
    
    
}
