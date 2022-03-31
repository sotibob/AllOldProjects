/**
* Class: CIST 2371 Introduction to Java
* Term: Fall 2020
* Instructor: Tanya Mosley
* Description: Solution to Lab 06
* Due: 10/11/ 20
* Author: John Doe
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/ 

public class Course
{
	private int CourseID;
	private String CourseName;
	private String Description;
	private int CreditHours;
	
	public int getCourseID()
	{
		return CourseID;
	}
	public void setCourseID(int newID)
	{
		this.CourseID = newID;
	}
	public String getCourseName()
	{
		return CourseName;
	}
	public void setCourseName(String newName)
	{
		this.CourseName = newName;
	}
	public String getDescription()
	{
		return Description;
	}
	public void setDescription(String newDescription)
	{
		this.Description = newDescription;
	}
	public int getCreditHours()
	{
		return CreditHours;
	}
	public void setCreditHours(int newHours)
	{
		this.CreditHours = newHours;
	}
	public void Display()
	{
		System.out.println("The CourseID is " + getCourseID());
		System.out.println("The CourseName is " + getCourseName());
		System.out.println("Description:  " + getDescription());
		System.out.println("It has " + getCreditHours() + " CreditHours");
	}
}