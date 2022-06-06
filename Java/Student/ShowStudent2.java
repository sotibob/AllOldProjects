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
public class ShowStudent2
{
	public static void main(String[] args)
	{
		Student s2 = new Student();
		System.out.println("ID number is: " + s2.ID);
		System.out.println("Total CreditHours is: " + s2.CreditHours);
		System.out.println("Total points earned is: " + s2.PointsEarned);
		System.out.println("GPA is: " + s2.GPA);
	}
}