

public class ForNestedHello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i = i + 1) {
			for (int j = 0; j < 2; j = j + 1) {
				System.out.println("Hello!");
			}
		}
	}
}