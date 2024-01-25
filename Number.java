public class Number {
  public static void main(String[] args) {
    try {
      String integer = "yy234"; // Initialize the string with a valid integer representation
      int no = Integer.parseInt(integer); // Parse the string to an integer
      System.out.println("Parsed integer: " + no);
    } catch (NumberFormatException e) {
      System.out.println("Exception caught: " + e.getMessage());
    }
  }
}
