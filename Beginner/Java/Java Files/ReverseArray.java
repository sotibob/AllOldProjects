//CIST 2371_Lab05
//Sotonte Bob-manuel
//4th of October, 2020.

public class ReverseArray		//class header
{							
	public static void main(String args[])		//main method
	{
		char[] name = {'f', 'l', 'o', 'w'};	 	//Array declared, and initializeed
		System.out.println("The letters in regular order are: ");	//Display before Print out
		for (int x = 0; x < name.length ; x++)		//for loop
		{
			System.out.println(name[x] + " ");		//Print out array in regular order
		}
		Reverse(name);		//Method to print out array in reverse order
	}
	
	public static void Reverse(char[] name)		//Reverse method
	{
		System.out.println("The letters in reverse order are: ");		//Display before Print out
		for(int x = name.length - 1; x >= 0; x--)		//for loop
		{
			System.out.println(name[x] + " ");		//Print out array in regular order
		}
	}
}