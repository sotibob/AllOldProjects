package testnewexception;

/********************
 *Sotonte Bob-manuel
 * Lab #4
 ********************/
public class TestNewException
{
    public void throwingMethod(int x) throws MyNewException
    {
        if (x==0)
        {
            throw new MyNewException();
        }
		else
        {
            System.out.println("X = " + x);
        }
    }

    
    public static void main(String[] args)
    {
        TestNewException te1 = new TestNewException();
        try
        {
            te1.throwingMethod(3);  //this code will not throw an exception
            te1.throwingMethod(0);  //this code WILL throw an exception
        }
        catch(MyNewException e)
        {
            System.out.println(e);  //calling toString() method
            e.display();            //calling display method
        }
    }
    
}
