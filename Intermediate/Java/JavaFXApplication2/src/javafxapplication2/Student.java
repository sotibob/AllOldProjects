/*********************
 * Sotonte Bob-manuel
 * Lab #9
 *********************/
package javafxapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student
{
    int sid;
    String fn;
    String ln;
    String street;
    String city;
    String state;
    int zip;
    String email;
    double gpa;
    
    public Student()
    {
        
    }
    
    public Student(int SID, String FN, String LN, String Street, String City, String State, int ZIP, String Email, double GPA)
    {
        sid = SID;
        fn = FN;
        ln = LN;
        street = Street;
        city = City;
        state = State;
        zip = ZIP;
        email = Email;
        gpa = GPA;
    }
    public void setSID(int SID){sid = SID;}
    public int getSID(){return sid;}
    
    public void setFN(String FN){fn = FN;}
    public String getFN(){return fn;}
    
    public void setLN(String LN){ln = LN;}
    public String getLN(){return ln;}
    
    public void setStreet(String Street){street = Street;}
    public String getStreet(){return street;}
    
    public void setCity(String City){city = City;}
    public String getCity(){return city;}
    
    public void setState(String State){state = State;}
    public String getState(){return state;}
    
    public void setZIP(int ZIP){zip = ZIP;}
    public int getZIP(){return zip;}
    
    public void setEmail(String Email){email = Email;}
    public String getEmail(){return email;}
    
    public void setGPA(double GPA){gpa = GPA;}
    public double getGPA(){return gpa;}
    
    public void display()
    {
        System.out.println("ID    : " + getSID());
        System.out.println("First Name  : " + getFN());
        System.out.println("Last Name  : " + getLN()); 
        System.out.println("Street   : " + getStreet());
        System.out.println("City : " + getCity());
        System.out.println("State : " + getState());
        System.out.println("Zip code : " + getZIP());
        System.out.println("Email : " + getEmail());
        System.out.println("GPA : " + getGPA());
        System.out.println("==============================");
    }
    
    public void selectDB(int SID)
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/RegistrationDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "select * from Students where ID = '" + SID + "'";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            sid = rs.getInt(1);
            fn =rs.getString(2);
            ln = rs.getString(3); 
            street = rs.getString(4);
            city = rs.getString(5);
            state = rs.getString(6);
            zip = rs.getInt(7);
            email = rs.getString(8);
            gpa = rs.getDouble(9);  
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void insertDB(int SID, String FN, String LN, String Street, String City, String State, int ZIP, String Email, double GPA)
    {
        sid = SID;
        fn = FN;
        ln = LN;
        street = Street;
        city = City;
        state = State;
        zip = ZIP;
        email = Email;
        gpa = GPA;
        
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/RegistrationDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "Insert into Students values(" + SID + ", '" + FN + "', '"
                    + LN + "', '" + Street + "', '" + City + "', '" + State +
                    "', " + ZIP + ", '" + Email + "', " + GPA + ")";
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
    
    public void updateDB()
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/RegistrationDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "update Students set ID = " + sid + ", FirstName = '" + fn
                    + "', LastName = '" + ln
                    + "', Street =  '" + street
                    + "', City = '" + city
                    + "', State = '" + state
                    + "', Zip = " + zip
                    + ", EMail = '" + email
                    + "', GPA = " + gpa + " where ID = " + sid + "";
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
    
    public void deleteDB()
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/RegistrationDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "delete from Students where ID = " + sid + "";
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
    
    public static void main(String[] args)
    {
        Student  s1 = new Student();
        s1.selectDB(4);
        s1.display();
        
        Student s2=new Student();
        s2.insertDB(33, "Frank", "Mayes", "123 Main street", "Atlanta", "GA", 30100,"fmayes@yahoo.com",3.3f);
        s2.display();
        
        Student s3 = new Student();
        s3.selectDB(7);
        s3.setZIP(30106);
        s3.updateDB();
        s3.display();
        
        Student s4 = new Student();
        s4.selectDB(6);
        s4.display();
        s4.deleteDB();
    }
}
