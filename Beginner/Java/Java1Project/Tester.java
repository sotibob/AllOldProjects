import java.util.Scanner;
public class Tester
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		GreyHound d2 = new GreyHound();
		Dog d3 = new Dog("Dino", "Golden", 2005);
		GreyHound d4 = new GreyHound("Turbo", "Black", 2006, 24);
		d1 = getD1(d1);
		d2 = getD2(d2);
		d1.Display();
		d2.Display();
		d3.Display();
		d4.Display();
	}
	
	public static Dog getD1(Dog D)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Name:");
		String Name = Input.nextLine();
		System.out.println("Enter Color: ");
		String Color = Input.nextLine();
		System.out.println("Enter Year of birth: ");
		int DOB = Input.nextInt();
		D.setName(Name);
		D.setColor(Color);
		D.setDOB(DOB);
		return D;
	}
	
	public static GreyHound getD2(GreyHound D)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String Name = Input.nextLine();
		System.out.println("Enter Color: ");
		String Color = Input.nextLine();
		System.out.println("Enter Year of birth: ");
		int DOB = Input.nextInt();
		System.out.println("Enter the number of races ran: ");
		int Races = Input.nextInt();
		D.setName(Name);
		D.setColor(Color);
		D.setDOB(DOB);
		D.setRaces(Races);
		return D;
	}
}