import java.sql.*;
/*****************************************************************************
  Ron Enz
  Procedure Class
 *****************************************************************************/
public class Procedure {
    // ======================  Properties  =============================
    private String pcode;
    private String pname, 
    private String pdesc;
    private double price;
    
    // ======================== Constructors ============================
    public Procedure() {
        pcode="";
        pname="";
        pdesc="";
        price=0.0;
    }
    public Procedure(String pc, String pn, String pd, double pr) {
        pcode=pc;
        pname=pn;
        pdesc=pd;
        price=pr;    
    }
    
    // ==================================  Behaviors ===============================
    public void setPcode(String pc){pcode=pc;}
    public String getPcode() {return pcode; }
    
    public void setPname(String pn){pname=pn;}
    public String getPname() {return pname; }
    
    public void setPdesc(String pd){pdesc=pd;}
    public String getPdesc() {return pdesc; }
    
    public void setPrice(double pr){price=pr;}
    public double getPrice() {return price; }
    
    public void display() {
        System.out.println("Procedure Code              = "+getPcode());
        System.out.println("Procedure Name              = "+getPname());
        System.out.println("Procedure Description       = "+getPdesc());
        System.out.println("Price                       = $"+getPrice());
    }
    
    // ++++++++++ DB Behaviors +++++++++++++
    public void selectDB(String pc){
        pcode=pc;
     
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/renz/Desktop/PatientDB.mdb");  
            
            Statement stmt = con1.createStatement();
            String sql = "Select * from Procedures where procCode='"+getPcode()+"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
             
            setPname(rs.getString(2));
            setPdesc(rs.getString(3));
            setPrice(rs.getDouble(4));
            
        }
        catch(Exception e){
            System.out.println(e);
        }
      
    }//end selectDB()
    
    public void insertDB(String pc, String pn, String pd, double pr){
        pcode=pc;
        pname=pn;
        pdesc=pd;
        price=pr;
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/renz/Desktop/PatientDB.mdb");
            
            Statement stmt = con1.createStatement();
            String sql = "Insert into Procedures values('"+getPcode()+"',"+
                                                      "'"+getPname()+"',"+ 
                                                      "'"+getPdesc()+"',"+ 
                                                      getPrice()+")"; 
            System.out.println(sql);
            int n1 = stmt.executeUpdate(sql);
            if (n1==1)
                System.out.println("INSERT Successful!!!");
            else
                System.out.println("INSERT FAILED***********");
            con1.close();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }//end insertDB()
    
    public void updateDB(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/renz/Desktop/PatientDB.mdb");
            
            Statement stmt = con1.createStatement();
            String sql = "update Procedures set procname = '"+getPname() + "',"+ 
                                            " procDesc ='"+getPdesc()+"',"+
                                            " cost = "+getPrice() +
                                            " where proccode='"+getPcode()+"'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            if (n==1)
                System.out.println("UPDATE Successful!!!");
            else
                System.out.println("UPDATE FAILED***********");
            con1.close();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }//end updateDB()
    
    public void deleteDB(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/renz/Desktop/PatientDB.mdb");
            
            Statement stmt = con1.createStatement();
            String sql = "Delete from Procedures where procCode='"+getPcode()+"'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            if (n==1)
                System.out.println("DELETE Successful!!!");
            else
                System.out.println("DELETE FAILED***********");
            con1.close();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }//end deleteDB()
    
    public static void main(String args[]) {
         
	//Testing selectDB()
        Procedure p1 = new Procedure();
        p1.selectDB("P119"); 
        p1.display();

	//Testing insertDB()
        Procedure p2 = new Procedure();
        p2.insertDB("P120", "Tooth Filling", "Fill cavaties", 320.00);
       	//check database to see if new PRocedure has been added

        //Testing updateDB()
        Procedure p3 = new Procedure();
        p3.selectDB("P119");
         
        p3.setPrice(325.00);
        p3.updateDB();
        p3.display();


        //Testing deleteDB()
        Procedure p4 = new Procedure();
        p4.selectDB("P120");
        p4.deleteDB();
        //check database to see if this PRocedure has been deleted
    }//end main
}//end class

