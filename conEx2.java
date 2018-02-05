import java.util.Scanner;
public class conEx2 {



    /**
     * Conditions and Loops Exercise 2: Days of the week
     *
     *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
     *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
     *
     */



        public static void main(String[] args) {

            // create scanner
            Scanner scanner = new Scanner(System.in);

            // prompt user
            System.out.println("Enter a number between 1 and 7");

            // assign input to variable as int
            int number = scanner.nextInt();

            // write completed code here
            if (number > 0 & number <= 7) {
                if (number == 1)
                    System.out.println("Monday");

                if (number == 2)
                    System.out.println("Tuesday");

                if (number == 3) System.out.println("Wednesday");
                if (number == 4) System.out.println("Thursday");
                if (number == 5) System.out.println("Friday");
                if (number == 6) System.out.println("Saturday");
                if (number == 7) System.out.println("Sunday");

            }


            else System.out.println("you did not follow directions");

        }
}
