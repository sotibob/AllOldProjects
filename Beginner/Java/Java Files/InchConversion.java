//CIST 2371_Lab04.a
//Sotonte Bob-manuel
//4th of October, 2020.

import java.util.Scanner;		//import the Scanner tool
public class InchConversion		//class header
 {
    public static void main(String[] args)		//main method
	{
        Scanner input = new Scanner(System.in);		//Scanner method for input
        System.out.println("Enter Inches:  ");		//Display output
        double num1 = input.nextDouble();		//Collect input and store in variable
        double FAnswer = feet(num1);		//Variable receives returned value
		double YAnswer = yard(num1);		//Variable receives returned value
        System.out.println(num1 + " inches is " + FAnswer + " feets");		//display the message and the content of each variable listed
		System.out.println(num1 + " inches is " + YAnswer + " yards");		//display the message and the content of each variable listed
	}
	
    public static double feet(double num1)		//feet method
	{
		double F_NUMBER = 12;		//constant
		double Convert = num1/F_NUMBER;		//Convert from inches to feets
		return Convert;		//return value for convert
	}
	public static double yard(double num1)		//yard method
	{
		double Y_NUMBER = 36;		//Constant
		double Convert = num1/Y_NUMBER;		//Convert from inches to yards
		return Convert;		//return value for convert
	}
 }