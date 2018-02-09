import java.util.Scanner;
public class Ex5 {


    /**
     * Fundamentals Exercise 5: Days to seconds
     *
     *      Take in a number in days from the user between 1 and 1,000,000,000 and convert it to
     *      seconds.
     *
     *      NOTE: We will be using the Scanner class to collect user input.
     *      This is demonstrated below.
     *      1 day is equal to 86400 seconds
     *
     */



        public static void main(String[] args) {

            // create scanner
            Scanner scanner = new Scanner(System.in);
            // prompt user
            System.out.print("Enter a number in days between 1 and 1,000,000,000: ");
            // assign input to variable as int
            int days = scanner.nextInt();
            int seconds = days * 86400;
            if (days == 1)System.out.println(days + " day equals " + seconds + " seconds" );
              else
            System.out.println(days + " days equals " + seconds + " seconds" );


            // write completed code here

        }

}
