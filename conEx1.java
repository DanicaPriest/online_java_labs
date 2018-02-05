import java.util.Scanner;
public class conEx1 {



    /**
     * Conditions and Loops Exercise 1: Even or Odd
     *
     *      Write a program that gets a number between 1 and 1,000,000,000
     *      from the user and determines whether it is odd
     *      or even using an if statement. Print the result.
     *
     *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
     */



        public static void main(String[] args) {

            // create scanner
            Scanner scanner = new Scanner(System.in);
            // prompt user
            System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
            // assign input to variable as int
            int number = scanner.nextInt();

            // write completed code here
            int isodd = number % 2;
           if(isodd == 0) System.out.println(number +" is even");
           else System.out.println(number + " is odd");

        }
}
