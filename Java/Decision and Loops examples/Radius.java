import java.util.*;

public class Radius {
	public static void main(String[] args) {
		
		double radius;
		double PI = 3.14;
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value for radius:");
		radius = input.nextDouble();
		if (radius >= 0) {
			area = radius * radius * PI;
			System.out.println("Area is " + area);
		} else {
		System.out.println("Error: Negative input");
		}
	}
}