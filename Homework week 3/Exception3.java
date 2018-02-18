public class Exception3 {
    /**
     * Exception Handling Exercise 3:
     *
     *      Demonstrate a try/catch/finally block.
     *
     */

    public static void main(String[] args) {
        int[]arr = new int[7];
        try{
            int i = arr[7];
            System.out.println("These words don't matter jfhffgfhhf");
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("you've caught me");

        }
        finally {
            System.out.println("I'll always be here no matter what");
        }
    }
}
