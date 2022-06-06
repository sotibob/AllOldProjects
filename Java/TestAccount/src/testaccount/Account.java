package testaccount;

/********************
 *Sotonte Bob-manuel
 * Lab #2
 ********************/
public class Account
{
    private double Balance;
    private String Owner;
    private int AcctNo;

    public Account()
    {

    }
    public Account(int acctno, String owner, double balance)
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
}
