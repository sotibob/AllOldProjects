
public class MyName		//class header
{							
	public static void main(String args[])		//main method
	{
		char[] Fname = {'S', 'o', 't', 'o', 'n', 't', 'e'};
		char[] Lname = {'B', 'o', 'b', 'm', 'a', 'n', 'u', 'e', 'l'};
		Name(Fname, Lname);
	}
	public static void Name(char[] Fname, char[] Lname)
	{
		System.out.println("My name is: ");
		for(int x = 0; x < Fname.length; x++)
		{
			System.out.println(Fname[x] + " ");
		}
		for(int y = 0; y < Lname.length; y++)
		{
			System.out.println(Lname[y] + " ");
		}
	}
}