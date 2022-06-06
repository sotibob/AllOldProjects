//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Procedure //Procedure Class
{
    //Initialized Variables
    String proCode;
    String proName;
    String proDesc;
    double cost;
    
    public Procedure() //Default Constructor
    {
        proCode = "N/A";
        proName = "N/A";
        proDesc = "N/A";
        cost = 0.0;
    }
    
    public Procedure(String ProCode, String ProName, String ProDesc, double Cost) //Constructor for receiving data
    {
        proCode = ProCode;
        proName = ProName;
        proDesc = ProDesc;
        cost = Cost;
    }
    
    //Set and Get Methods
    public String getProCode() {return proCode;}
    public void setProCode(String ProCode) {proCode = ProCode;}
    
    public String getProName() {return proName;}
    public void setProName(String ProName) {proName = ProName;}
    
    public String getProDesc() {return proDesc;}
    public void setProDesc(String ProDesc) {proDesc = ProDesc;}
    
    public double getCost() {return cost;}
    public void setCost(double Cost) {cost = Cost;}
    
    public void Display() //Display Method
    {
        System.out.println("Procedure Code : " + getProCode());
        System.out.println("Procedure Name    : " + getProName());
        System.out.println("Procedure Description    : " + getProDesc());
        System.out.println("Cost   : $" + getCost());
        System.out.println("==============================");
    }
    
    public void selectDB(String ProCode) //Select Method
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/DentistOfficeMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "select * from Procedures where procCode = '" + ProCode + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            proCode = rs.getString(1);
            proName = rs.getString(2);
            proDesc = rs.getString(3);
            cost =rs.getDouble(4);
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void insertDB(String ProCode, String ProName, String ProDesc, double Cost) //Insert Method
    {
        proCode = ProCode;
        proName = ProName;
        proDesc = ProDesc;
        cost = Cost;
        
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/DentistOfficeMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "Insert into Procedures values('" + proCode + "', '" + proName + "', '"
                    + proDesc + "', " + cost + ")";
            System.out.println(sql);

            int rs;
            rs = stmt.executeUpdate(sql);
            if (rs ==1){System.out.println("Insert Successful!");}
            else{System.out.println("Insert Failed!!!");}
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void updateDB() //Update Method
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/DentistOfficeMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "update Procedures set procName = '" + proName
                    + "', procDesc = '" + proDesc
                    + "', cost =  " + cost
                    + " where procCode = '" + proCode + "'";
            System.out.println(sql);

            int rs;
            rs = stmt.executeUpdate(sql);
            if (rs ==1){System.out.println("Update Successful!");}
            else{System.out.println("Update Failed!!!");}
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void deleteDB() //Delete Method
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/DentistOfficeMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "delete from Procedures where procCode = '" + proCode + "'";
            System.out.println(sql);

            int rs;
            rs = stmt.executeUpdate(sql);
            if (rs ==1){System.out.println("Delete Successful!");}
            else{System.out.println("Delete Failed!!!");}
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
}