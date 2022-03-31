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

public class DemoPizza
{
	public static void main(String[] args)
	{
		String Description;
		int Price;
		String DeliveryAddress;
		
		Pizza p1 = new Pizza("Meaty Deluxe Pizza", 22);
		Pizza p2 = new Pizza("Veggie Pizza", 13);
		DeliveryPizza p3 = new DeliveryPizza("Pepperoni Pizza", 14, "123 South Lane");
		DeliveryPizza p4 = new DeliveryPizza("Pineapple Pizza", 18, "1234 North Lane");
		System.out.println("");
		p1.Display();
		System.out.println("");
		p2.Display();
		System.out.println("");
		p3.Display();
		p4.Display();
	}
}