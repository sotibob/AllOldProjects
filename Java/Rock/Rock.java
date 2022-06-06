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

public class Rock
{
	private int SampleNum;
	private double Weight;
	private String Description;
	
	public Rock()
	{
		
	}
	public Rock(int Sample, double weight)
	{
		this.SampleNum = Sample;
		this.Weight = weight;
		this.Description = "Unclassified";
	}
	
	public void setDescription(String Desc)
	{
		this.Description = Desc;
	}
	public int getSample()
	{
		return SampleNum;
	}
	public double getWeight()
	{
		return Weight;
	}
	public String getDescription()
	{
		return Description;
	}
	public void Display()
	{
		System.out.println("Sample #" + getSample() + " weighs " + getWeight() + "grams");
		System.out.println("Description: " + getDescription());
		System.out.println("");
	}
}