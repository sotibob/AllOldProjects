/**
* Class: CIST 2371 Introduction to Java
* Term: Fall 2020
* Instructor: Tanya Mosley
* Description: Solution to Lab 09
* Due: 11/15/ 20
* Author: John Doe
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/ 

public class Pizza
{
	private String description;
	private int price;
	
	public Pizza()
	{
		
	}
	public Pizza(String Description, int Price)
	{
		this.description = Description;
		this.price = Price;
	}
	public void Display()
	{
		System.out.println("The price of " + description + " is :  $" + price);
	}
}