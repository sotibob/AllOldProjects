/*********************
 *Sotonte Bob-manuel
 *Lab #8
 *********************/
package pkg3.buttons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTester {
    public static void main(String[] args)
    {
        System.out.println("Starting DB Tester...");
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/RegistrationDB.mdb");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "select * from Instructors";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            while ( rs.next() )
            {
               System.out.println("ID    : " + rs.getInt(1));
               System.out.println("First Name  : " + rs.getString(2));
               System.out.println("Last Name  : " + rs.getString(3)); 
               System.out.println("Street   : " + rs.getString(4));
               System.out.println("City : " + rs.getString(5));
               System.out.println("State : " + rs.getString(6));
               System.out.println("Zip code : " + rs.getInt(7));
               System.out.println("Office : " + rs.getString(8));
               System.out.println("E-Mail : " + rs.getString(9));
               System.out.println("==============================");   
            }
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
}
