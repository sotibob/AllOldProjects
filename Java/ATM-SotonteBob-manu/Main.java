import java.util.Scanner;

// Create an application that acts as an ATM machine. The initial balance should start at 0. 
// Ask the user for a deposit/withdrawal and use this to affect the actual balance. Reflect the change in balance using a print out statement.
// This transaction process should loop till the user types done instead of a number.
class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double balance = 0.0;
    boolean isDone = false;
    
    System.out.println("Your balance is: " + balance);
    System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal):");
    System.out.println("Please type done when transaction is complete or you want to exit");
    
    while (!isDone) {
      if (scanner.hasNextDouble()) {
        double num = scanner.nextDouble();
        double total = balance + num;
        if(total < 0) {
          System.out.println("Your account can't have negative values");
          System.out.println("Your balance is: " + balance);
          System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal):");
        }
        else {
          balance = total;
          System.out.println("Your balance is: " + balance);
          System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal):");
        }
      }
      else if (scanner.hasNextLine()){
        String done = scanner.nextLine();
        if (done.equalsIgnoreCase("Done")) {
          isDone = true;
        }
      }
    }
  }
}
