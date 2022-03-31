 /*****************************************************************************
  Ron Enz
  Procedure Class
  ArrayList & Vector Examples
 *****************************************************************************/
import java.util.*;
 
public class Procedure{
    // ======================  Properties  =============================
    private String pCode;
	private String pName;
	private String pDesc;
	private float price;
     
    // ======================== Constructors ============================
    public Procedure() {
        pCode="";
        pName="";
        pDesc="";
        price=0.0f;
    }
    public Procedure(String pc, String pn, String pd, float pr) {
        pCode=pc;
        pName=pn;
        pDesc=pd;
        price = pr;   
    }
    
    // ==================================  Behaviors ===============================
    public void setPCode(String pc){pCode=pc;}
    public String getPCode() {return pCode; }
    
    public void setPName(String pn){pName=pn;}
    public String getPName() {return pName; }
    
	public void setPDesc(String pd){pDesc=pd;}
    public String getPDesc() {return pDesc; }
    
    public void setPrice(float pr){price=pr;}
    public float getPrice() {return price; } 
    
    public void display() {
        System.out.println("Procedure Code               = "+getPCode());
        System.out.println("Procedure Name               = "+getPName());
		System.out.println("Procedure Desc               = "+getPDesc());
        System.out.println("Procedure Price              = "+getPrice());
        System.out.println("===========================================");
    }
   
    public static void main(String args[]) {
        // ArrayList Example
        Procedure pr1 = new Procedure("P114", "Cleaning", "Extensive Cleaning of all teeth", 199.00f);
		Procedure pr2 = new Procedure("P122", "Root Canal", "Rplace Decayed Tooth", 799.00f);
		Procedure pr3 = new Procedure("P131", "Bridge", "Install new Bridge", 1899.00f);
		 
         
		ArrayList<Procedure> arrList = new ArrayList<Procedure>();
		arrList.add(pr1);
		arrList.add(pr2);
		arrList.add(pr3);
		
		System.out.println("ArrayList OUTPUT ");
		Procedure p1;
		for (int i = 0; i<arrList.size(); i++){
			p1 = arrList.get(i);
			p1.display();
		}
		
		// Vector Example
		 
		Procedure proc1 = new Procedure("P114", "Cleaning", "Extensive Cleaning of all teeth", 199.00f);
		Procedure proc2 = new Procedure("P122", "Root Canal", "Rplace Decayed Tooth", 799.00f);
		Procedure proc3 = new Procedure("P131", "Bridge", "Install new Bridge", 1899.00f);
         
		Vector<Procedure> myVec = new Vector<Procedure>(2);
		myVec.add(proc1);
		myVec.add(proc2);
		myVec.add(proc3);
		
		System.out.println("Vector OUTPUT ");
		/*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: "+myVec.size());
      
		/*Display Vector elements*/
		
        Enumeration en = myVec.elements();
		Procedure pp1;
        while(en.hasMoreElements()){
            pp1=(Procedure)en.nextElement();
			pp1.display();
		}
		
		
		
    }//end main
}
