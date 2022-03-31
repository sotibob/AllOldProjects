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

public class Die
{
	private int value;
	private static int HIGHEST_DIE_VALUE = 6;
	private static int LOWEST_DIE_VALUE = 1;
	
	public Die() 
	{
		value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	public int getValue() 
	{
		return value;
	}
}