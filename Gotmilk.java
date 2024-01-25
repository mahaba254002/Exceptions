import java.util.Scanner;

public class Gotmilk {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int donutCount = 0;
    int milkCount = 0;

    try {
      System.out.println("Enter number of donuts:");
      donutCount = keyboard.nextInt();
      System.out.println("Enter number of glasses of milk:");
      milkCount = keyboard.nextInt();
      keyboard.close();

      if (milkCount < 1) {
        throw new ArithmeticException("Exception: No milk!");
      }
    } catch (ArithmeticException ae) {
      System.out.println("Exception caught: " + ae.getMessage());
      System.out.println("Go buy some milk.");
    } finally {
      System.out.println("End of program.");
    }

    if (milkCount >= 1) {
      double donutsPerGlass = (double) donutCount / milkCount;
      System.out.println("You have " + donutCount + " donuts.");
      System.out.println("You have " + milkCount + " glasses of milk.");
      System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");

    }
  }
}

