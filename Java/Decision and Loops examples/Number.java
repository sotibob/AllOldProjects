import java.util.*;

public class Number {
	public static void main(String[] args) {
		
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = input.nextInt();
		
		if( number % 5 == 0) {
			System.out.println("Number is divisible by 5");
		}
	}
}