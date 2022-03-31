package Business;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Currency;

/*
    Sotonte Bob-manuel
    Lab 04
    I promise I wrote this code
 */
public class Account
{
    int acctNo;
    int cID;
    String type;
    int balance;
    
    public Account()
    {
        acctNo = 0;
        cID = 0;
        type = "";
        balance = 0;
    }
    
    public Account(int AcctNo, int Cid, String Type, int Balance)
    {
        acctNo = AcctNo;
        cID = Cid;
        type = Type;
        balance = Balance;    
    }
    
    public void setAcctNo(int AcctNo){acctNo = AcctNo;}
    public int getAcctNo(){return acctNo;}
    
    public void setCid(int Cid){cID = Cid;}
    public int getCid(){return cID;}
    
    public void setType(String Type){type = Type;}
    public String getType(){return type;}
    
    public void setBalance(int Balance){balance = Balance;}
    public int getBalance(){return balance;}
    
    public void Display()
    {
        System.out.println("Account No    : " + getAcctNo());
        System.out.println("Customer ID    : " + getCid());
        System.out.println("Account Type   : " + getType());
        System.out.println("Balance : $" + getBalance());
        System.out.println("==============================");
    }
    
    public void selectDB(int AcctNo)
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
            sql = "select * from Accounts where AcctNo = " + AcctNo + "";
            System.out.println(sql);

            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data - Step #5
            rs.next();
            acctNo = rs.getInt(1);
            cID = rs.getInt(2);
            type = rs.getString(3);
            balance =rs.getInt(4);
            
            //Close Connection - Step #6
            con.close();				
        }
        catch(Exception e)
        {
            System.out.println("PP: " + e);
        }
    }
    
    public void insertDB(int AcctNo, int Cid, String Type, int Balance)
    {
        acctNo = AcctNo;
        cID = Cid;
        type = Type;
        balance = Balance;
        
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
            sql = "Insert into Accounts values(" + AcctNo + ", " + Cid + ", '"
                    + Type + "', " + Balance + ")";
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
            sql = "update Accounts set AcctNo = " + acctNo + ", Cid = " + cID
                    + ", Type = '" + type
                    + "', Balance =  " + balance
                    + " where AcctNo = " + acctNo + "";
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
            sql = "delete from Accounts where AcctNo = " + acctNo + "";
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
