import java.util.Scanner;

public class NameTooLong extends Exception {

    /**
     * Exception Handling Exercise 7:
     *
     *      1) Create a custom exception.
     *      2) Demonstrate a method throwing your custom exception.
     */
    @Override
    public String toString() {
        return "NameTooLong{ Name is too long}";
    }
    public static void main(String[] args) throws NameTooLong {
         System.out.println("Enter name:");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         if (name.length() > 10){
             throw new NameTooLong();
         }

    }
}
