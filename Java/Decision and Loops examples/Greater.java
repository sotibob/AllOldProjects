import java.util.*;

public class Greater {
	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value for i:");
		i = input.nextInt();
		System.out.println("Please enter value for j:");
		j = input.nextInt();
		System.out.println("Please enter value for k:");
		k = input.nextInt();
		
		if (i > j) {
			if (j > k)
			System.out.println("i and j are greater than k");
			}
		else {
			System.out.println("i is less than or equal to j");
		}
	}
}