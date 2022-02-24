/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

/**
 *
 * @author DEll
 */
public class Projects {
    
    private String name;
    
    private String location;
    
    private String Owner;
    
    private String cnic;
    
    private String contact;
    
    private int house;
    
    private int sector;
    
    private int amount;
    
    private String date;
    
    private String status;
    
    public Projects()
    {
        this.status = "InProgress";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////                               File Handing
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setFName(String name) {
        this.name = name;
    }

    public void setFLocation(String location) {
        this.location = location;
    }

    public void setFOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setFCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setFContact(String contact) {
        this.contact = contact;
    }

    public void setFHouse(int house) {
        this.house = house;
    }

    public void setFSector(int sector) {
        this.sector = sector;
    }

    public void setFAmount(int amount) {
        this.amount = amount;
    }

    public void setFDate(String date) {
        this.date = date;
    }

    public void setFStatus(String status) {
        this.status = status;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                              Getter
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return Owner;
    }

    public String getCnic() {
        return cnic;
    }

    public String getContact() {
        return contact;
    }

    public int getHouse() {
        return house;
    }

    public int getSector() {
        return sector;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean setName(String name)
    {
        int size = name.length();
        boolean flag=false;
        
        for(int i =0;i<size;i++)
        {
            if((name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='0' && name.charAt(i)<='9')||(name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)==' ')||(name.charAt(i)=='-'))
            {
                flag = true;
            }
            else
                return false;
        }
        this.name = name;
        return flag;
        
    }
    
    public boolean isDigits(String data)
    {
        boolean flag = false;
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
    
    public boolean setLocaction(String name)
    {
        int size = name.length();
        boolean flag=false;
        
        for(int i =0;i<size;i++)
        {
            if((name.charAt(i)>='0' && name.charAt(i)<='9')||(name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)==' ')||(name.charAt(i)=='(')||(name.charAt(i)==')')||(name.charAt(i)=='-'))
            {
                flag = true;
            }
            else
                return false;
        }
        this.location = name;
        return flag;
        
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
        this.Owner = name;
        return flag;
        
    }
    
    public boolean setCnic(String cnic) {
        int size=cnic.length();
        boolean flag=false;
        if(size==13)
        {
            for(int i =0;i<size;i++)
            {
                if(cnic.charAt(i)>='0' && cnic.charAt(i)<='9')
                    flag=true;
                else
                    return false;
            }   
        }
        else
            return false;
        
        this.cnic=cnic;
        return flag;
    }
    
    public boolean setHouse(int house)
    {
        if(house > 0)
        {
            this.house = house;
            return true;
        }
        else
            return false;
    }
    
    public boolean setSector(int sector)
    {
        this.sector = sector;
        return true;
    }
    
    public boolean setAmount(int amount)
    {
        if(amount > 0)
        {
            this.amount = amount;
            return true;
        }
        else
            return false;
    }
    
    public boolean setDate(String date)
    {
        this.date = date;
        return true;
    }
    
    public void setComplete()
    {
        this.status = "Complete";
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
    
    
    
    
    
    
}
