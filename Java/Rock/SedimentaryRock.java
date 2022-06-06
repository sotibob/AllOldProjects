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

public class SedimentaryRock extends Rock
{
	public SedimentaryRock()
	{
		
	}
	public SedimentaryRock(int Sample, double weight)
	{
		super(Sample, weight);
		setDescription("Sedimentary rocks are types of rock that are formed by the accumulation or deposition of mineral " + 
		"or organic particles at the Earth's surface, followed by cementation.");
	}
	public void Display()
	{
		super.Display();
	}
}