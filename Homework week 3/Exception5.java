
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception5 {
    /**
     * Exception Handling Exercise 5:
     * <p>
     * Demonstrate how to throw an exception.
     */
    public static void main(String[] args) {
        System.out.println("pick a word:");
        Scanner scanner = new Scanner(System.in);
        String userword = scanner.nextLine();
        if (userword.equals("aaaaaa")) {
            throw new InputMismatchException("You found the secret word");

        } else {
            System.out.println(userword);
        }
    }
}