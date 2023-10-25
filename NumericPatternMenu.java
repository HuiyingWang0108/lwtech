import java.util.Scanner;

/**
 * @author Huiying Wang
 */

public class NumericPatternMenu {

  /**
   * Validates user input to ensure it's an integer.
   *
   * @param prompt  The message to display to the user.
   * @param scanner The Scanner object for input.
   * @return The validated integer input from the user.
   */
  public static int validateInt(String prompt, Scanner scanner) {
    while (true) {
      System.out.println(prompt + "");
      if (scanner.hasNextInt()) {
        return scanner.nextInt();
      } else {
        System.out.println("ERROR. Number entered is not an integer.");
        scanner.next(); // Consume the invalid input.
      }
    }
  }

  /**
   * Validates user input to ensure it's a positive integer.
   *
   * @param prompt  The message to display to the user.
   * @param scanner The Scanner object for input.
   * @return The validated positive integer input from the user.
   */
  public static int validatePositiveInt(String prompt, Scanner scanner) {
    while (true) {
      int number = validateInt(prompt, scanner);
      if (number > 0) {
        return number;
      } else {
        System.out.println("ERROR. Number entered is not positive.");
      }
    }
  }

  /**
   * Generates a numeric pattern of the specified type and size.
   *
   * @param size    The size of the pattern.
   * @param pattern The pattern type (1 or 2).
   * @return The generated numeric pattern as a string.
   */
  public static String numericPattern(int size, int pattern) {
    if (size <= 0) {
      throw new IllegalArgumentException("Size must be a positive integer.");
    }
    StringBuilder res = new StringBuilder();

    if (pattern == 1) {
      // Pattern in ascending order
      for (int i = 1; i <= size; i++) {
        res.append(i);
      }
      for (int i = size - 1; i >= 1; i--) {
        res.append(i);
      }
    } else {
      // Pattern in descending order
      for (int i = size; i >= 1; i--) {
        res.append(i);
      }
      for (int i = 2; i <= size; i++) {
        res.append(i);
      }
    }

    return res.toString();
  }

  public static void main(String[] args) {
    // write your code here
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.println("Numeric Pattern Display");
      System.out.println("1. Print Type I pattern (like 12321)");
      System.out.println("2. Print Type II pattern (like 32123)");
      System.out.println("3. Quit");
      System.out.println("Enter your choice (1 - 3): ");
      int choice = validateInt("Please enter a valid menu choice", keyboard);

      if (choice == 1 || choice == 2) {
        int size = validatePositiveInt("Please enter the size of the pattern. The size must be a positive integer: ",
            keyboard);
        String pattern = numericPattern(size, choice);
        System.out.println(pattern);
      } else if (choice == 3) {
        System.out.println("Quitting!");
        break;
      } else {
        System.out.println("ERROR. Number entered is not a valid selection.");
      }
    }
  }
}
