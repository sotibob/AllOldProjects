package testexceptions;

/********************
 *Sotonte Bob-manuel
 * Lab #2
 ********************/
public class TestExceptions
{
    public static void main(String[] args)
    {
        try
        {
            int[] myArr;
            myArr = new int[10];
            int x,y,z;
            x=0;
            y=10;
            z=y/x;

            myArr[10] = 0;
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Exception: Denominator cannot be zero");
            System.out.println(ex.getMessage());
        }
    }
    
}
