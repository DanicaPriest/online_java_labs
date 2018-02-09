public class conEx6 {
    /**
     * Conditions and Loops Exercise 6: Basic while loop
     *
     *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
     *
     */

    public static void main(String[] args){

        int i = 1;
        int sum= 0;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
