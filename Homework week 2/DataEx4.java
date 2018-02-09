import java.util.Scanner;
public class DataEx4 {
    /**
     * Data Types and Operators Exercise 4: Arrays calculator
     *
     *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
     *      calculate the sum of all of the numbers in the array as well as the average.
     *
     *      Print the results to the console.
     *
     */


    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);
        Scanner scanner8 = new Scanner(System.in);
        Scanner scanner9 = new Scanner(System.in);
        Scanner scanner10 = new Scanner(System.in);

        numbers[0] = scanner1.nextInt();
        numbers[1] = scanner2.nextInt();
        numbers[2] = scanner3.nextInt();
        numbers[3] = scanner4.nextInt();
        numbers[4] = scanner5.nextInt();
        numbers[5] = scanner6.nextInt();
        numbers[6] = scanner7.nextInt();
        numbers[7] = scanner8.nextInt();
        numbers[8] = scanner9.nextInt();
        numbers[9] = scanner10.nextInt();
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        };
        System.out.println("the sum of your numbers is: " + sum);
        System.out.println("the average of your numbers is: " + sum/numbers.length);




    }

}
