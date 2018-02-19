import java.util.Scanner;

public class Exception6 {
    /**
     * Exception Handling Exercise 6:
     *
     *      Demonstrate throwing an exception in one method and catching it in another method.
     *
     */


    public static void printString(int num)throws StringIndexOutOfBoundsException {
        String sentence = "this is a random sentence";
        if (num > sentence.length()){
            throw new StringIndexOutOfBoundsException("Number is too big");
        }
        System.out.println(sentence.substring(num, sentence.length()));
    }
    public static void main(String[] args)  {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printString(num);



    }
    }

