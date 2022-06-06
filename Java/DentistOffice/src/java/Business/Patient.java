//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Patient //Patient Class
{
    //Initialized Variables
    String id;
    String password;
    String firstname;
    String lastname;
    String address;
    String email;
    String insurance;
    public Procedure procedure = new Procedure();
    public Dentist dentist = new Dentist();
    public String dateTime;
    public String dentId;
    public String proc;
    
    public Patient() //Default Constructor
    {
        id = "N/A";
        password = "N/A";
        firstname = "N/A";
        lastname = "N/A";
        address = "N/A";
        email = "N/A";
        insurance = "N/A";
    }
    
    public Patient(String ID, String Password, String FirstName, String LastName, String Address, String Email, String Insurance) //Constructor for receiving data
    {
        id = ID;
        password = Password;
        firstname = FirstName;
        lastname = LastName;
        address = Address;
        email = Email;
        insurance = Insurance;
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
    
    public String getAddress() {return address;}
    public void setAddress(String Address) {address = Address;}
    
    public String getEmail() {return email;}
    public void setEmail(String Email) {email = Email;}
    
    public String getInsurance() {return insurance;}
    public void setInsurance(String Insurance) {insurance = Insurance;}
    
    public void Display() //
    {
        System.out.println("Patient ID    : " + getID());
        System.out.println("Patient Password    : " + getPassword());
        System.out.println("First Name   : " + getFirstName());
        System.out.println("Last Name : " + getLastName());
        System.out.println("Address : " + getAddress());
        System.out.println("Email : " + getEmail());
        System.out.println("Insurance Company : " + getInsurance());
        System.out.println("==============================");
        System.out.println("Appointment Date/Time    : " + dateTime);
        System.out.println("Dentist ID    : " + dentId);
        procedure.Display();
    }
    
    public void getProcedure() //Pulls the Procedure information for the patient
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
            sql = "Select apptDateTime, dentId, procCode from Appointments where patId = '" + getID() + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //Process Data - Step #5
            rs.next();           
            dateTime = rs.getString(1);
            dentId = rs.getString(2);
            proc = rs.getString(3);
            procedure.selectDB(proc);
            dentist.selectDB(dentId);
            
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
            sql = "select * from Patients where patId = '" + ID + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            id = rs.getString(6);
            password = rs.getString(7);
            firstname = rs.getString(1);
            lastname =rs.getString(2);
            address = rs.getString(3);
            email =rs.getString(4);
            insurance =rs.getString(5);
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
        getProcedure();
    }
    
    public void insertDB(String ID, String Password, String FirstName, String LastName, String Address, String Email, String Insurance) //Insert Method
    {
        id = ID;
        password = Password;
        firstname = FirstName;
        lastname = LastName;
        address = Address;
        email = Email;
        insurance = Insurance;
        
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
            sql = "Insert into Patients values('" + firstname + "', '" + lastname + "', '" + address + "', '" + email 
                    + "', '" + insurance + "', '" + id + "', '" + password + "')";
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
            sql = "update Patients set passwd = '" + password
                    + "', firstName = '" + firstname + "', lastName =  '" + lastname
                    + "', addr =  '" + address + "', email =  '" + email 
                    + "', insCo =  '" + insurance + "' where patId = '" + id + "'";
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
            sql = "delete from Patients where patId = '" + id + "'";
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
