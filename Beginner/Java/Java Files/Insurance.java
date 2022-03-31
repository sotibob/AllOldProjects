//CIST 2371_Lab04.b
//Sotonte Bob-manuel
//4th of October, 2020.

import java.util.Scanner;		//import the Scanner tool
public class Insurance		//class header
 {
    public static void main(String[] args) 		//main method
	{
        Scanner input = new Scanner(System.in);		//Scanner method for input
        System.out.println("Enter the current year:  ");		//Display message
        double Current = input.nextDouble();		//Collect input and store in variable
		System.out.print("Enter the birth year:  ");		//display message
		double Birth = input.nextDouble();		//Collect input and store in variable
		double Premium = Decade(Current, Birth);		//Variable receives returned value
		System.out.println("The premium is $" + Premium);		//display the message and premium amount
	}
	
	public static double Decade(double Current, double Birth)		//decade method
	{
		double Years = (Current - Birth) / 10;		//Calculate for age and divide by 10 to get decade
		double RYears = Math.round(Years);		//round decade to the closest whole
		double Amount = (RYears + 15)*20;		//calculate premium amount
		return Amount;		//return amount
	}
 }

