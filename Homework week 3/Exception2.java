import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Exception2 {
    /**
     * Exception Handling Exercise 2:
     * <p>
     * Demonstrate a try/catch with multiple catch statements.
     */
    public static void main(String[] args) {


        System.out.println("First number");
        try {
            Scanner scanner1 = new Scanner(System.in);

            int a = scanner1.nextInt();
            System.out.println("Second number");
            Scanner scanner2 = new Scanner(System.in);
            int b = scanner2.nextInt();
            System.out.println(a / b);
        }
        catch (ArithmeticException exc){
            System.out.println("You can't divide by zero");
        }
       catch (InputMismatchException exc){
           System.out.println("That's not a number");
       }
    }


}
