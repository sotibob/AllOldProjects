package Business;


import Business.Account;

/*
    Sotonte Bob-manuel
    Lab 04
    I promise I wrote this code
 */
public class AccountList
{
    public int count = 0;
    public Account acc[] = new Account[10];
    
    public AccountList()
    {
        acc[count] = new Account();
        count = 0;
    }
    
    public void addAccount(Account a)
    {
        acc[count] = a;
        count++;
    }
    
    public void Display()
    {
        for (int i = 0; i < count; i++)
        {
            acc[i].Display();
        }
    }
}
