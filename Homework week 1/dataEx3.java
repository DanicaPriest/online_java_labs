import java.util.Scanner;

public class dataEx3 {
    /**
     * Data Types and Operators Exercise 3: Pig latin
     *
     *      Take in the user's name and print out their name translated to pig latin.
     *      For the purpose of this program, we will say that any word or name can be
     *      translated to pig latin by moving the first letter to the end, followed by "ay".
     *      For example: ryan -> yanray, caden -> adencay
     *
     *      HINT: We will make use of the substring() method.
     */


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your name: ");

        String name = scanner.nextLine();
        String firstletter = name.substring(0,1);
                System.out.println("your name in piglatin is " + name.substring(1,name.length()) + firstletter + "ay");
    }
}
