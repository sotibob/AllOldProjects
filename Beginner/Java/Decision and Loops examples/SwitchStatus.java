//import the package with the Scanner class
import java.util.Scanner;

public class SwitchStatus {

	public static void main (String[] args) {
		//create Scanner object to get data from user
		Scanner input = new Scanner(System.in);
		
		
		//Prompt user for data input
		System.out.print("Enter one of the following for single, married, or head of household: S, M, H: ");
		
		//Assign data received to "figure" variable
		String status = input.nextLine();
		 	
		switch(status) {
			case "S": System.out.print("Your tax rate is 25%.");
				
					break;	

			case "M": System.out.print("Your tax rate is 10%.");
				
					break;

			case "H": System.out.print("Your tax rate is 15%.");
				
					break;

			default: System.out.println("Invalid entry");
						System.exit(0);
             }
			 
	}
}
 