/*********************
 * Sotonte Bob-manuel
 * Lab #12
 *********************/
package presidentsaa;

import java.util.ArrayList;
import java.util.Scanner;

public class PresidentsAA
{
    public PresidentsAA()
    {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("George Washington");
        arrList.add("John Adams");
        arrList.add("Thomas Jefferson");
        arrList.add("James Madison");
        arrList.add("James Monroe");
        arrList.add("John Quincy Adams");
        arrList.add("Andrew Jackson");
        arrList.add("Martin Van Buren");
        arrList.add("William Henry Harrison");
        arrList.add("John Tyler");
        
        Scanner myPres = new Scanner(System.in);
        System.out.println("What number President of the USA do you want displayed from the 1st to 10th?");
        int presNum = myPres.nextInt();
        String Pres = arrList.get(presNum-1);
        if(presNum == 1)
        {
            System.out.println("The 1st President of the USA was " + Pres);
        }
        else if(presNum == 2)
        {
            System.out.println("The 2nd President of the USA was " + Pres);
        }
        else if(presNum == 3)
        {
            System.out.println("The 3rd President of the USA was " + Pres);
        }
        else if(presNum > 3)
        {
            System.out.println("The " + presNum + "th President of the USA was " + Pres);
        }
    }
    
    public static void main(String[] args)
    {
        PresidentsAA p1 = new PresidentsAA();
    }
}
