/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class DesignProjects extends Projects{
    
    private String id;
    
    private String services;
    
    private int balance;
    
    public DesignProjects()
    {
        super();
    }
    
    public DesignProjects(String services)
    {
        super();
        this.services = services;
        
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                      File Handling
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setFId(String id) {
        this.id = id;
    }

    public void setFServices(String services) {
        this.services = services;
    }

    public void setFBalance(int balance) {
        this.balance = balance;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                     Getters
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getId() {
        return id;
    }

    public String getServices() {
        return services;
    }

    public int getBalance() {
        return balance;
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setID()
    {
        String id = "DD-";
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
    
}
