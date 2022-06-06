/**
* Class: CIST 2371 Introduction to Java
* Term: Fall 2020
* Instructor: Tanya Mosley
* Description: Solution to Lab 08
* Due: 11/1/ 20
* Author: John Doe
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/ 

public class TwoDice
{
	public static void main(String[] args)
	{
		 Die firstDie = new Die();
		 Die secondDie = new Die();
		 System.out.println("First die is " + firstDie.getValue());
		 System.out.println("Second die is " + secondDie.getValue());
	}
}