import java.util.Arrays;
import java.util.Scanner;

public class DataEx5 {


    /**
     * Data Types and Operators Exercise 5: More arrays
     * <p>
     * Using the array below, take in a number from 1-10 from the user and print out the index of that
     * element.
     */


    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        System.out.println("pick a number 1-10");
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



    }
}
