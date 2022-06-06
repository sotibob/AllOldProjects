/**
* Class: CIST 2371 Introduction to Java
* Term: Fall 2020
* Instructor: Tanya Mosley
* Description: Solution to Lab 07
* Due: 10/18/ 20
* Author: John Doe
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/ 

import java.util.Scanner;
public class ShowStudent
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1 = getData(s1);
		System.out.println("ID number is: " + s1.getID());
		System.out.println("Total CreditHours is: " + s1.getCreditHours());
		System.out.println("Total points earned is: " + s1.getPointsEarned());
		System.out.println("GPA is: " + s1.getGPA());
	}
	
	public static Student getData(Student Info)
	{
		int ID;
		double CreditHours;
		double PointsEarned;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Student ID: ");
		ID = input.nextInt();
		Info.setID(ID);
		System.out.println("Enter your total Credit Hours earned: ");
		CreditHours = input.nextDouble();
		Info.setCreditHours(CreditHours);
		System.out.println("Enter total points earned: ");
		PointsEarned = input.nextDouble();
		Info.setPointsEarned(PointsEarned);
		return Info;
	}
	
}