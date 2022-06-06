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

public class DemoRocks
{
	public static void main(String[] args)
	{
		Rock r1 = new Rock(12, 4.5);
		IgneousRock r2 = new IgneousRock(13, 4.8);
		SedimentaryRock r3 = new SedimentaryRock(16, 5.4);
		MetamorphicRock r4 = new MetamorphicRock(15, 3.7);
		System.out.println("");
		r1.Display();
		r2.Display();
		r3.Display();
		r4.Display();
	}
}