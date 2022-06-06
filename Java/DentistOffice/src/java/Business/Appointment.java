//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Appointment //Appointment class
{
    //Initialized variables
    String dateTime;
    String pID;
    String dID;
    String proCode;
    
    public Appointment() //Default Constructor
    {
        dateTime = "N/A";
        pID = "N/A";
        dID = "N/A";
        proCode = "N/A";
    }
    
    public Appointment(String DateTime, String PID, String DID, String ProCode) //Constyructor for receiving data
    {
        dateTime = DateTime;
        pID = PID;
        dID = DID;
        proCode = ProCode;
    }
    
    //Set and Get Methods
    public String getDateTime() {return dateTime;}
    public void setDateTime(String DateTime) {dateTime = DateTime;}
    
    public String getPID() {return pID;}
    public void setPID(String PID) {pID = PID;}
    
    public String getDID() {return dID;}
    public void setDID(String DID) {dID = DID;}
    
    public String getProCode() {return proCode;}
    public void setProCode(String ProCode) {proCode = ProCode;}
    
    public void Display() //Display Method
    {
        System.out.println("Appointment Date/Time    : " + getDateTime());
        System.out.println("Patient ID    : " + getPID());
        System.out.println("Dentist ID   : " + getDID());
        System.out.println("Procedure Code : " + getProCode());
        System.out.println("==============================");
    }
    
    public void selectDB(String DateTime, String pId) //Select Method
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
            sql = "select * from Appointments where apptDateTime = '" + DateTime + "' AND patId = '" + pId + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            dateTime = rs.getString(1);
            pID = rs.getString(3);
            dID = rs.getString(4);
            proCode = rs.getString(2);
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void insertDB(String DateTime, String PID, String DID, String ProCode) //Insert Method
    {
        dateTime = DateTime;
        pID = PID;
        dID = DID;
        proCode = ProCode;
        
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
            sql = "Insert into Appointments values('" + dateTime + "', '" + proCode + "', '" + pID + "', '" + dID + "')";
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
            sql = "update Appointments set dentId = '" + dID
                    + "', procCode = '" + proCode
                    + "' where apptDateTime = '" + dateTime + "' AND patId = '" + pID + "'";
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
            sql = "delete from Appointments where apptDateTime = '" + dateTime + "' AND patId = '" + pID + "'";
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
