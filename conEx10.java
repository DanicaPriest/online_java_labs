public class conEx10 {
    /**
     * Conditions and Loops Exercise 10: continue
     * <p>
     * Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
     */
    public static void main(String[] args) {
        int i = 10;
        for (; i > 0; i--) {

            if (i == 5) {
                System.out.println("This is a continue");
                continue;
            }
            System.out.println("Not a continue");
        }
    }
}