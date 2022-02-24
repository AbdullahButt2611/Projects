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
public class Vendors {
    
    private String id;
    
    private String company;
    
    private String owner;
    
    private String contact;
    
    private String type;
    
    private int sharePer;
    
    private int balance;
    
    public Vendors()
    {}
    
    public Vendors(String type)
    {
        this.type = type;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                    //File Handling
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setFId(String id) {
        this.id = id;
    }

    public void setFCompany(String company) {
        this.company = company;
    }

    public void setFOwner(String owner) {
        this.owner = owner;
    }

    public void setFContact(String contact) {
        this.contact = contact;
    }

    public void setFType(String type) {
        this.type = type;
    }

    public void setFSharePer(int sharePer) {
        this.sharePer = sharePer;
    }

    public void setFBalance(int balance) {
        this.balance = balance;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                // Getter
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getOwner() {
        return owner;
    }

    public String getContact() {
        return contact;
    }

    public String getType() {
        return type;
    }

    public int getSharePer() {
        return sharePer;
    }

    public int getBalance() {
        return balance;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setID()
    {
        String id = "V-";
        
        Random rand = new Random();
        for(int i=0;i<4;i++)
        {
            id+=rand.nextInt(10);
        }
        this.id = id;
    }
    
    public boolean setOwner(String name)
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
        this.owner = name;
        return flag;
        
    }
    
    public boolean setCompany(String name)
    {
        int size = name.length();
        boolean flag=false;
        
        for(int i =0;i<size;i++)
        {
            if((name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)>='0' && name.charAt(i)<='9')||(name.charAt(i)==' ')||(name.charAt(i)=='-')||(name.charAt(i)=='_'))
            {
                flag = true;
            }
            else
                return false;
        }
        this.company = name;
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
            this.contact=contact;
            return flag;
        }
        else
            return false;
        
//        this.contact=contact;
//        return flag;
    }
    
    public boolean setShare(int share)
    {
        if(share>0)
            this.sharePer = share;
        else
            return false;
        
        return true;
    }
    
    public void balance(int balance)
    {
        this.balance = balance;
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
    
    public boolean addMoney(int amount)
    {
        if(amount>0)
        {
            this.balance += amount;
            return true;
        }
        else
            return false;
    }
    
    public boolean isAvailable(int amount)
    {
        if(amount<=this.balance)
            return true;
        else
            return false;
    }
    
    public void withdraw(int amount)
    {
        this.balance = balance - amount;
    }
    
    
    
}
