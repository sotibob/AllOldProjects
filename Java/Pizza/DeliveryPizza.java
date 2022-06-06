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

public class DeliveryPizza extends Pizza
{
	private String DeliveryAddress;
	private int DeliveryFee;
	
	public DeliveryPizza()
	{
		
	}
	public DeliveryPizza(String Description, int Price, String Address)
	{
		super(Description, Price);
		this.DeliveryAddress = Address;
		if(Price > 15)
		{
			this.DeliveryFee = 3;
		}
		else
		{
			this.DeliveryFee = 5;
		}
	}
	public void Display()
	{
		super.Display();
		System.out.println("with Delivery Address: " + DeliveryAddress + ",");
		System.out.println("and a Delivery Fee of:  $" + DeliveryFee);
		System.out.println("");
	}
}