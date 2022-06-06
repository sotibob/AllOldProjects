package testaccount;

/********************
 *Sotonte Bob-manuel
 * Lab #2
 ********************/
public class TestAccount
{
    public static void main(String[] args)
    {
        try
        {
            Account a1;
            a1 = new Account(2222, "Frank", 500.00);
            a1.deposit(100.00);
            a1.withdraw(900.00);
            a1.display();
        }
        catch(InsufficientFunds e)
        {
            e.display();
        }
    }
    
}
