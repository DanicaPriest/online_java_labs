import java.util.Scanner;

public class conEx7 {
    /**
     * Conditions and Loops Exercise 7: First vowel
     *
     *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
     *      Once you find the vowel, print out the word and the first vowel.
     *
     */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        int i = 0;
        String vowels = "aeiouAEIOU";
        String firstv = word.substring(i,i +1);


        while(vowels.indexOf(firstv) == -1){

            if (i == word.length())
            {
                if(word.indexOf("y") == -1){
                    firstv = "There are no vowels in " + word + ". That's not a word.";
                    break;}
                else {
                    firstv = "y";
                    break;}


            }
            firstv = word.substring(i,i +1);




            i++;



        }
        System.out.println("the first vowel in " + word + " is: " + firstv);
    }
}