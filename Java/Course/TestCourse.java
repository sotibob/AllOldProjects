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

public class TestCourse
{
	public static void main(String args[])
	{
		Course c1 = new Course();
		c1.setCourseID(109);
		c1.setCourseName("Intro to Python");
		c1.setDescription("This course introduces the Python programming language");
		c1.setCreditHours(4);
		c1.Display();
	}
}