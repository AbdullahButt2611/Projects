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
public class ConsultancyProjects extends Projects{
    
    private String id;
    
    private String services;
    
    private int balance;
    
    private int Ushare;
    
    private int Jshare;
    
    public ConsultancyProjects()
    {
        super();
    }
    
    public ConsultancyProjects(String services)
    {
        super();
        this.services = services;
        this.Ushare = 0;
        this.Jshare = 0;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                          File Handling
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setFId(String id) {
        this.id = id;
    }

    public void setFServices(String services) {
        this.services = services;
    }

    public void setFBalance(int balance) {
        this.balance = balance;
    }

    public void setFUshare(int Ushare) {
        this.Ushare = Ushare;
    }

    public void setFJshare(int Jshare) {
        this.Jshare = Jshare;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                          Getters
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getId() {
        return id;
    }

    public String getServices() {
        return services;
    }

    public int getBalance() {
        return balance;
    }

    public int getUshare() {
        return Ushare;
    }

    public int getJshare() {
        return Jshare;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setID()
    {
        String id = "CC-";
        Random rand = new Random();
        
        for(int i = 0; i<4;i++)
        {
            id+=rand.nextInt(10);
        }
        this.id=id;
    }
    
    public boolean setBalance(int balance)
    {
        this.balance = balance;
//        if(getAmount()>balance)
//        {
//            JOptionPane.showMessageDialog(this,"The Balance is Less for ( "+getName()+" ) project\nSending Mail as  a reminder!");
//        }
            
        return true;
    }
    
    public void setJshare()
    {
        double result = balance *(40/100);
        
        this.Jshare = (int)result;
    }
    
    public void setUshare()
    {
        double result = balance *(60/100);
        
        this.Ushare = (int)result;
    }
    
    
    
    
    
}
