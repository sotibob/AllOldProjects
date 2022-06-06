package testnewexception;

/********************
 *Sotonte Bob-manuel
 * Lab #4
 ********************/
public class MyNewException extends Exception
{
    private final String errMsg = "My New Error Message";
    
    @Override
    public String toString()
    {
        return errMsg;
    }
    public void display()
    {
        System.out.println("MyNewException Error Message " + errMsg);
    }
}
