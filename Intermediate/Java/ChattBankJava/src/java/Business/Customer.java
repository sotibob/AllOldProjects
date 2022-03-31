package Business;


import Business.AccountList;
import Business.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
    Sotonte Bob-manuel
    Lab 04
    I promise I wrote this code
 */
public class Customer
{
    int cID;
    int cPassword;
    String cFirstName;
    String cLastName;
    String cAddress;
    String cEmail;
    public AccountList acctList;
    
    public Customer()
    {
        cID = 0;
        cPassword = 0;
        cFirstName = "";
        cLastName = "";
        cAddress = "";
        cEmail = "";
        acctList = new AccountList();
    }
    
    public Customer(int CustID, int CustPassword, String CustFirstName, String CustLastName, String CustAddress, String CustEmail)
    {
        cID = CustID;
        cPassword = CustPassword;
        cFirstName = CustFirstName;
        cLastName = CustLastName;
        cAddress = CustAddress;
        cEmail = CustEmail;
    }
    public void setCustID(int CustID){cID = CustID;}
    public int getCustID(){return cID;}
    
    public void setCustPassword(int CustPassword){cPassword = CustPassword;}
    public int getCustPassword(){return cPassword;}
    
    public void setCustFirstName(String CustFirstName){cFirstName = CustFirstName;}
    public String getCustFirstName(){return cFirstName;}
    
    public void setCustLastName(String CustLastName){cLastName = CustLastName;}
    public String getCustLastName(){return cLastName;}
    
    public void setCustAddress(String CustAddress){cAddress = CustAddress;}
    public String getCustAddress(){return cAddress;}
    
    public void setCustEmail(String CustEmail){cEmail = CustEmail;}
    public String getCustEmail(){return cEmail;}
    
    public void getAccounts()
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/ChattBankMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "Select AcctNo from Accounts where Cid = " + getCustID();
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            int an;
            Account a1;
            while (rs.next())
            {
                an = rs.getInt(1);
                a1 = new Account();
                a1.selectDB(an);
                acctList.addAccount(a1);
            }
            
            //Close Connection - Step #6
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void Display()
    {
        System.out.println("Customer ID    : " + getCustID());
        System.out.println("Customer Password    : " + getCustPassword());
        System.out.println("Customer FirstName  : " + getCustFirstName());
        System.out.println("Customer LastName  : " + getCustLastName()); 
        System.out.println("Customer Address   : " + getCustAddress());
        System.out.println("Customer Email : " + getCustEmail());
        System.out.println("==============================");
        acctList.Display();
    }
    
    public void selectDB(int CustID)
    {
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/ChattBankMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "select * from Customers where CustID = " + CustID + "";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            cID = rs.getInt(1);
            cPassword = rs.getInt(2);
            cFirstName =rs.getString(3);
            cLastName = rs.getString(4); 
            cAddress = rs.getString(5);
            cEmail = rs.getString(6);
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
        getAccounts();
    }
    
    public void insertDB(int CustID, int CustPassword, String CustFirstName, String CustLastName, String CustAddress, String CustEmail)
    {
        cID = CustID;
        cPassword = CustPassword;
        cFirstName = CustFirstName;
        cLastName = CustLastName;
        cAddress = CustAddress;
        cEmail = CustEmail;
        
        try
        {
            //Load Driver - Step #1
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            //Get Connection - Step #1
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/ChattBankMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "Insert into Customers values(" + CustID + ", " + CustPassword + ", '"
                    + CustFirstName + "', '" + CustLastName + "', '" + CustAddress + "', '" + CustEmail +"')";
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
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/ChattBankMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "update Customers set CustID = " + cID + ", Password = " + cPassword
                    + ", FirstName = '" + cFirstName
                    + "', LastName =  '" + cLastName
                    + "', Address = '" + cAddress
                    + "', Email = '" + cEmail + "' where CustID = " + cID + "";
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
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Sotonte Bob-manuel/OneDrive/Documents/Java DB/ChattBankMDB.mdb");
            System.out.println("Database Connected");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "delete from Customers where CustID = " + cID + "";
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
        Customer c1 = new Customer();
        c1.selectDB(3001);
        c1.Display();
    }
}
