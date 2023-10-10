import java.util.Random;
import java.util.Scanner;

/**
 * @author Huiying Wang
 */

public class MathTutor {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        // initialize a Random object
        Random rnd = new Random();

        int num1, num2, answer;
        String choice, reponse;

        while (true) {
            System.out.println("Math Tutor");
            System.out.println("1. Addition problem\n" +
                    "2. Subtraction problem\n" +
                    "3. Quit");
            System.out.print("Enter your choice (1 - 3):");

            // generate a random integer from 0 to 999
            num1 = rnd.nextInt(1000);
            num2 = rnd.nextInt(1000);
            // Let num1 store the bigger number
            if (num1 < num2) {
                int tempNum = num1;
                num1 = num2;
                num2 = tempNum;
            }
            String lineString = "--------";
            choice = scanner.next();
            if (choice.equals("1")) {
                answer = num1 + num2;
                System.out.printf("%8d%n+%7d%n%s%n", num1, num2, lineString);
                reponse = scanner.next();
                checkAnswerCorrect(answer, reponse);
            } else if (choice.equals("2")) {
                answer = num1 - num2;
                System.out.printf("%8d%n-%7d%n%s%n", num1, num2, lineString);
                reponse = scanner.next();
                checkAnswerCorrect(answer, reponse);
            } else if (choice.equals("3")) {
                break;
            }
        }
    }

    private static void checkAnswerCorrect(int answer, String reponse) {
        if (reponse.equals(answer)) {
            System.out.println("Congratulations!\n");
        } else {
            System.out.println("The correct answer is: " + answer + "\n");
        }
    }
}