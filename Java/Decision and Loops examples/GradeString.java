import java.util.*;

public class GradeString {
	public static void main(String[] args) {
		
		int score;
		String grade;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value for score:");
		score = input.nextInt();

		
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println("Your letter grade is:" + grade);
	}
}