package accvector;

/********************
 *Sotonte Bob-manuel
 * Lab #4
 ********************/
public class InsufficientFunds extends Exception
{
    private final String errMsg = "You have Insufficient Funds!";
    
    @Override
    public String toString()
    {
        return errMsg;
    }
    public void display()
    {
        System.out.println("Error Message: " + errMsg);
    }
}
