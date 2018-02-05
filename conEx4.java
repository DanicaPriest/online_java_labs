public class conEx4 {
    /**
     * Conditions and Loops Exercise 4: Even numbers
     *
     *      Using a "for-loop", print out all even numbers from 1-100.
     *
     */
    public static void main(String[] args){
        int i = 1;

        for (; i <= 100; i++){
            if (i % 2 == 0)
            System.out.println(i);
        }
    }
}
