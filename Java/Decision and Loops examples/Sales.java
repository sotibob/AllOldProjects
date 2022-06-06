import java.util.*;

public class Sales {
	public static void main(String[] args) {
		
		int purchase;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the purchase amount:");
		purchase = input.nextInt();
		
		if(purchase>=35){
			System.out.println("Shipping is free");
		} else {
			System.out.println("Shipping is $5.");
	}
}
}