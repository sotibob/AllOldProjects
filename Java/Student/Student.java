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

public class Student
{
	int ID;
	double CreditHours;
	double PointsEarned;
	double GPA;
	
	public Student()
	{
		ID = 9999;
		CreditHours = 3;
		PointsEarned = 12;
		GPA = PointsEarned/CreditHours;
	}
	public void setID(int newID)
	{
		this.ID = newID;
	}
	public void setCreditHours(double newCreditHours)
	{
		this.CreditHours = newCreditHours;
	}
	public void setPointsEarned(double newPointsEarned)
	{
		this.PointsEarned = newPointsEarned;
	}
	public double getGPA() 
	{
		GPA = (PointsEarned/CreditHours);
		return GPA;
	}
	public int getID()
	{
		return ID;
	}
	public double getCreditHours()
	{
		return CreditHours;
	}
	public double getPointsEarned()
	{
		return PointsEarned;
	}
}