/*********************
 * Sotonte Bob-manuel
 * Lab #12
 *********************/
package accvector;

import java.util.Enumeration;
import java.util.Vector;

public class AccVector
{
    private double Balance;
    private String Owner;
    private int AcctNo;
    
    public AccVector(int acctno, String owner, double balance)
    {
        this.Balance = balance;
        this.Owner = owner;
        this.AcctNo = acctno;
    }
    public void setBalance(double balance)
    {
        this.Balance = balance;
    }
    public void setOwner(String owner)
    {
        this.Owner = owner;
    }
    public void setAcctNo(int acctno)
    {
        this.AcctNo = acctno;
    }
    public double getBalance()
    {
        return Balance;
    }
    public String getOwner()
    {
        return Owner;
    }
    public int getAcctNo()
    {
        return AcctNo;
    }
    public void display()
    {
        System.out.println("Your Account Number is: " + getAcctNo());
        System.out.println("Name: " + getOwner());
        System.out.println("Your Account Balance is: " + getBalance());
        System.out.println("");
    }
    public void deposit(double dep)
    {
        double AddDep = Balance + dep;
        this.Balance = AddDep;
    }
    public void withdraw(double with) throws InsufficientFunds
    {
        double SubWith = Balance - with;
        if(SubWith < 0)
        {
            throw new InsufficientFunds();
        }
        else
        {
            this.Balance = SubWith;
        }
    }
    
    public static void main(String[] args)
    {
        AccVector a1 = new AccVector(1111, "George", 500.00);
        AccVector a2 = new AccVector(2222, "James", 600.00);
        AccVector a3 = new AccVector(3333, "Milner", 700.00);
        
        Vector<AccVector> myVec = new Vector<AccVector>(2);
        myVec.add(a1);
        myVec.add(a2);
	myVec.add(a3);
        System.out.println("Vector OUTPUT ");
        System.out.println("Size after addition: "+ myVec.size());
        Enumeration en = myVec.elements();
        AccVector pp1;
        while(en.hasMoreElements())
        {
            pp1=(AccVector)en.nextElement();
            pp1.display();
	}
    }
}
