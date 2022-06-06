//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dentist //Dentist Class
{
    //Initialized Variables
    String id;
    String password;
    String firstname;
    String lastname;
    String email;
    String office;
    public AppointmentList apptList;
    
    public Dentist() //Default Constructor
    {
        id = "N/A";
        password = "N/A";
        firstname = "N/A";
        lastname = "N/A";
        email = "N/A";
        office = "N/A";
        apptList = new AppointmentList();
    }
    
    public Dentist(String ID, String Password, String FirstName, String LastName, String Email, String Office) //Constructor that receives data
    {
        id = ID;
        password = Password;
        firstname = FirstName;
        lastname = LastName;
        email = Email;
        office = Office;
    }
    
    //Set and Get Methods
    public String getID() {return id;}
    public void setID(String ID) {id = ID;}
    
    public String getPassword() {return password;}
    public void setPassword(String Password) {password = Password;}
    
    public String getFirstName() {return firstname;}
    public void setFirstName(String FirstName) {firstname = FirstName;}
    
    public String getLastName() {return lastname;}
    public void setLastName(String LastName) {lastname = LastName;}
    
    public String getEmail() {return email;}
    public void setEmail(String Email) {email = Email;}
    
    public String getOffice() {return office;}
    public void setOffice(String Office) {office = Office;}
    
    public void Display() //Display Method
    {
        System.out.println("Dentist ID    : " + getID());
        System.out.println("Dentist Password    : " + getPassword());
        System.out.println("First Name   : " + getFirstName());
        System.out.println("Last Name : " + getLastName());
        System.out.println("Email : " + getEmail());
        System.out.println("Office : " + getOffice());
        System.out.println("==============================");
        apptList.Display();
    }
    
    public void getAppointments() //Method to get all the dentists appointments and put it in a an array
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
            sql = "Select apptDateTime, patId from Appointments where dentId = '" + getID() + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            String ad;
            String pId;
            Appointment a1;
            
            //Process data - Step #5
            while (rs.next())
            {
                ad = rs.getString(1);
                pId = rs.getString(2);
                a1 = new Appointment();
                a1.selectDB(ad, pId);
                apptList.addAppointment(a1);
            }
            
            //Close Connection - Step #6
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void selectDB(String ID) //Select Method
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
            sql = "select * from Dentists where id = '" + ID + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            id = rs.getString(4);
            password = rs.getString(5);
            firstname = rs.getString(1);
            lastname =rs.getString(2);
            email =rs.getString(3);
            office =rs.getString(6);
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
        getAppointments();
    }
    
    public void insertDB(String ID, String Password, String FirstName, String LastName, String Email, String Office) //Insert Method
    {
        id = ID;
        password = Password;
        firstname = FirstName;
        lastname = LastName;
        email = Email;
        office = Office;
        
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
            sql = "Insert into Dentists values('"+ firstname + "', '" + lastname + "', '" + email + "', '" + id + "', '" 
                    + password + "', '" + office + "')";
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
            sql = "update Dentists set passwd = '" + password
                    + "', firstName = '" + firstname + "', lastName =  '" + lastname
                    + "', email =  '" + email + "', office =  '" + office
                    + "' where id = '" + id + "'";
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
            sql = "delete from Dentists where id = '" + id + "'";
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
