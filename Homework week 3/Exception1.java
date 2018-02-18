import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

    /**
     * Exception Handling Exercise 1:

     * 1) Demonstrate a try/catch.
     */
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        System.out.println("pick a number 1-10");

        try {
            Scanner scanner = new Scanner(System.in);
            int usernumber = scanner.nextInt();
            int index = -1;
            for (int i = 0; i < array.length; ++i) {
                if (usernumber == array[i]) {
                    index = i;
                    break;
                }
            }
            System.out.println("Array index = " + index);

        } catch (InputMismatchException exc) {

            System.out.println("This is not a number");
        }










    }


}
