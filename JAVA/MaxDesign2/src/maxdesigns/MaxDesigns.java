/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 *
 * @author DEll
 */
public class MaxDesigns {
    private String path = "D:\\Files\\";
    private static MaxDesigns instance;
    
    private ArrayList<Employee> emp;
    
    private ArrayList<DesignProjects> des;
    
    private ArrayList<ConsultancyProjects> con;
    
    private ArrayList<Vendors> ven;

    public ArrayList<Employee> getEmp() {
        return emp;
    }

    public ArrayList<DesignProjects> getDes() {
        return des;
    }

    public ArrayList<ConsultancyProjects> getCon() {
        return con;
    }

    public ArrayList<Vendors> getVen() {
        return ven;
    }
    
    
    
    private MaxDesigns()
    {
        emp = new ArrayList<>();
        des = new ArrayList<>();
        con = new ArrayList<>();
        ven = new ArrayList<>();
    }
    
    public static MaxDesigns getInstance()
    {
        if(instance== null)
            instance = new MaxDesigns();
        
        return instance;
    }
    
    public void writeEmp()
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\Employee.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("The Data will be in format\nID,Name,Email,Gender,Age,Status,Salary,Contact,DateJoined\n");
            for(int i =0;i<emp.size();i++)
            {
                br.write(emp.get(i).getID()+","+emp.get(i).getName()+","+emp.get(i).getEmail()+","+emp.get(i).getGender()+","+emp.get(i).getAge()+","+emp.get(i).getStatus()+","+emp.get(i).getSalary()+","+emp.get(i).getContact()+","+emp.get(i).getDateJoined()+"\n");
            }
            
            
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Employee File Write Exception");
        }
    }
    
    public void readEmp()
    {
        try
        {
            FileReader fr = new FileReader("D:\\Files\\Employee.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            line=br.readLine();
            while(line!=null && line!="")
            {
                String toks[]=line.split(",");
                Employee e = new Employee();
                //ID,Name,Email,Gender,Age,Status,Salary,Contact,DateJoined
                e.setFID(toks[0]);
                e.setFName(toks[1]);
                e.setFEmail(toks[2]);
                e.setFGender(toks[3]);
                e.setFAge(Integer.parseInt(toks[4]));
                e.setFStatus(toks[5]);
                e.setFSalary(Integer.parseInt(toks[6]));
                e.setFContact(toks[7]);
                e.setFDateJoined(toks[8]);
                emp.add(e);
                
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Employee File Read Exception");
        }
    }
    
    public void writeDes()
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\DrawingDesigns.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("The Data will be in format\nID,Name,Location,Owner,Cnic of Owner,Contact of Owner,House no.,Sector,Amount,Date started,Status,Services,Balance\n");
            for(int i =0;i<des.size();i++)
            {
                br.write(des.get(i).getId()+","+des.get(i).getName()+","+des.get(i).getLocation()+","+des.get(i).getOwner()+","+des.get(i).getCnic()+","+des.get(i).getContact()+","+des.get(i).getHouse()+","+des.get(i).getSector()+","+des.get(i).getAmount()+","+des.get(i).getDate()+","+des.get(i).getStatus()+","+des.get(i).getServices()+","+des.get(i).getBalance()+"\n");
            }
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Drawing Design File Write Exception");
        }
    }
    
    public void readDes()
    {
        try
        {
            FileReader fr = new FileReader("D:\\Files\\DrawingDesigns.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            line=br.readLine();
            //ID,Name,Location,Owner,Cnic of Owner,Contact of Owner,House no.,Sector,Amount,Date started,Status,Services,Balance
            while(line!=null && line!="")
            {
                String toks[]=line.split(",");
                DesignProjects d = new DesignProjects();
                d.setFId(toks[0]);
                d.setFName(toks[1]);
                d.setFLocation(toks[2]);
                d.setFOwner(toks[3]);
                d.setFCnic(toks[4]);
                d.setFContact(toks[5]);
                d.setFHouse(Integer.parseInt(toks[6]));
                d.setFSector(Integer.parseInt(toks[7]));
                d.setFAmount(Integer.parseInt(toks[8]));
                d.setFDate(toks[9]);
                d.setFStatus(toks[10]);
                d.setFServices(toks[11]);
                d.setFBalance(Integer.parseInt(toks[12]));
                des.add(d);
                
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Drawing Design File Read Exception");
        }
    }
    
    public void writeCon()
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\Consultancy.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("The Data will be in format\nID,Name,Location,Owner,Cnic of Owner,Contact of Owner,House no.,Sector,Amount,Date started,Status,Services,Balance,Ushare,Jshare\n");
            for(int i =0;i<con.size();i++)
            {
                br.write(con.get(i).getId()+","+con.get(i).getName()+","+con.get(i).getLocation()+","+con.get(i).getOwner()+","+con.get(i).getCnic()+","+con.get(i).getContact()+","+con.get(i).getHouse()+","+con.get(i).getSector()+","+con.get(i).getAmount()+","+con.get(i).getDate()+","+con.get(i).getStatus()+","+con.get(i).getServices()+","+con.get(i).getBalance()+","+con.get(i).getUshare()+","+con.get(i).getJshare()+"\n");
            }
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Consultancy File Write Exception");
        }
    }
    
    public void readCon()
    {
        try
        {
            FileReader fr = new FileReader("D:\\Files\\Consultancy.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            line=br.readLine();
            //ID,Name,Location,Owner,Cnic of Owner,Contact of Owner,House no.,Sector,Amount,Date started,Status,Services,Balance,Ushare,Jshare
            while(line!=null && line!="")
            {
                String toks[]=line.split(",");
                ConsultancyProjects d = new ConsultancyProjects();
                d.setFId(toks[0]);
                d.setFName(toks[1]);
                d.setFLocation(toks[2]);
                d.setFOwner(toks[3]);
                d.setFCnic(toks[4]);
                d.setFContact(toks[5]);
                d.setFHouse(Integer.parseInt(toks[6]));
                d.setFSector(Integer.parseInt(toks[7]));
                d.setFAmount(Integer.parseInt(toks[8]));
                d.setFDate(toks[9]);
                d.setFStatus(toks[10]);
                d.setFServices(toks[11]);
                d.setFBalance(Integer.parseInt(toks[12]));
                d.setFUshare(Integer.parseInt(toks[13]));
                d.setFJshare(Integer.parseInt(toks[14]));
                
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Consultancy File Read Exception");
        }
    }
    
    public void writeVen()
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\Vendor.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("The Data will be in format\nID,Company,Owner,Contact,Type,SharePercentage,Balance\n");
            for(int i =0;i<ven.size();i++)
            {
                br.write(ven.get(i).getId()+","+ven.get(i).getCompany()+","+ven.get(i).getOwner()+","+ven.get(i).getContact()+","+ven.get(i).getType()+","+ven.get(i).getSharePer()+","+ven.get(i).getBalance()+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    public void readVen()
    {
        try
        {
            FileReader fr = new FileReader("D:\\Files\\Vendor.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            line=br.readLine();
            while(line!=null && line!="")
            {
                //ID,Company,Owner,Contact,Type,SharePercentage,Balance
                String toks[]=line.split(",");
                Vendors v = new Vendors();
                v.setFId(toks[0]);
                v.setFCompany(toks[1]);
                v.setFOwner(toks[2]);
                v.setFContact(toks[3]);
                v.setFType(toks[4]);
                v.setFSharePer(Integer.parseInt(toks[5]));
                v.setFBalance(Integer.parseInt(toks[6]));
                ven.add(v);
                
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendors File Read Exception");
        }
    }
    
    
    public String ConRead()
    {
        String data = "";
        try{
            FileReader fr = new FileReader("D:\\Files\\ConsultancyRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(!line.equals(null))
            {
                if(data.equals(""))
                {
                    data+=line;
                }
                else
                    data+="\n"+line;
                
                line = br.readLine();
            }
            
                
        }
        catch(Exception ex)
        {
            System.out.println("Consultancy Record File Read Exception (RecordDisplayForm)");
        }
        
        if(data.equals("") || data.equals(null))
            {
                data += "***********************************************************************\n";
                data += "                                  Max Designs\n";
                data += "***********************************************************************\n";
                data += "\n                          No Data to Show\n";
                return data;
            }
            else
                return data;
    }
    
    public String DrawRead()
    {
        String data = "";
        try{
            FileReader fr = new FileReader("D:\\Files\\DesignRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(!line.equals(null))
            {
                if(data.equals(""))
                {
                    data+=line;
                }
                else
                    data+="\n"+line;
                
                line = br.readLine();
            }
            
                
        }
        catch(Exception ex)
        {
            System.out.println("Design Record File Read Exception (RecordDisplayForm)");
        }
        if(data.equals("") || data.equals(null))
            {
                data += "***********************************************************************\n";
                data += "                               Max Designs\n";
                data += "***********************************************************************\n";
                data += "\n                          No Data to Show\n";
                return data;
            }
            else
                return data;
        
//        return data;
    }
    
    public String VenRead()
    {
        String data = "";
        try{
            FileReader fr = new FileReader("D:\\Files\\VendorRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(!line.equals(null))
            {
                if(data.equals(""))
                {
                    data+=line;
                }
                else
                    data+="\n"+line;
                
                line = br.readLine();
            }
            
                
        }
        catch(Exception ex)
        {
            System.out.println("Design Record File Read Exception (RecordDisplayForm)");
        }
        if(data.equals("") || data.equals(null))
            {
                data += "***********************************************************************\n";
                data += "                               Max Designs\n";
                data += "***********************************************************************\n";
                data += "\n                          No Data to Show\n";
                return data;
            }
            else
                return data;
        
//        return data;
    }
    
    public String EmpRead()
    {
        String data = "";
        try{
            FileReader fr = new FileReader("D:\\Files\\EmployeeRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(!line.equals(null))
            {
                if(data.equals(""))
                {
                    data+=line;
                }
                else
                    data+="\n"+line;
                
                line = br.readLine();
            }
            
                
        }
        catch(Exception ex)
        {
            System.out.println("Design Record File Read Exception (RecordDisplayForm)");
        }
        if(data.equals("") || data.equals(null))
            {
                data += "***********************************************************************\n";
                data += "                               Max Designs\n";
                data += "***********************************************************************\n";
                data += "\n                          No Data to Show\n";
                return data;
            }
            else
                return data;
        
//        return data;
    }
    
    public void ConWrite(String text)
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\ConsultancyRecord.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(text);
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    public void DrawWrite(String text)
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\DesignRecord.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(text);
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    public void VenWrite(String text)
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\VendorRecord.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(text);
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    public void EmpWrite(String text)
    {
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\EmployeeRecord.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(text);
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    public void SeperateDraw(String file,String text)
    {
        try
        {
            String path = "D:\\Files\\Drawing Designs\\"+file+".txt";
            FileWriter fr = new FileWriter(path,true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(text);
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    public void SeperateCon(String file,String text)
    {
        try
        {
            String path = "D:\\Files\\Consultancy\\"+file+".txt";
            FileWriter fr = new FileWriter(path,true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(text);
            
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Vendor File Write Exception");
        }
    }
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MaxDesigns.getInstance().readEmp();
        MaxDesigns.getInstance().readDes();
        MaxDesigns.getInstance().readCon();
        MaxDesigns.getInstance().readVen();
        
//        MaxDesigns.getInstance().writeEmp();
//        MaxDesigns.getInstance().writeDes();
//        MaxDesigns.getInstance().writeCon();
//        MaxDesigns.getInstance().writeVen();
        
        
        LoadForm f = new LoadForm();
        f.setVisible(true);
        
        
        
        try{
            for(int i=0;i<100;i++)
            {
                Thread.sleep(60);
                f.getLoading().setValue(i);
            }
        }
        catch(Exception ex)
        {
        }
        ActorsForm act = new ActorsForm();
        f.setVisible(false);
        act.setVisible(true);
        f.dispose();
    }
    
}
