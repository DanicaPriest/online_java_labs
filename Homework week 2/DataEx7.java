public class DataEx7 {

    /**
     * Data Types and Operators Exercise 7: Irregular Arrays
     * <p>
     * Create and populate an irregular array of size and contents of your choosing. Using a nested
     * "for-each" loop, iterate and print out each element of the array.
     */

    public static void main(String[] args) {

        int[][] irregularA = {
                {1, 34},
                {3, 7, 8},
                {8, 3, 9}
        };

        for (int[] i : irregularA) {
            for(int j : i ){
            System.out.print( j + ", ");
            }System.out.println();
        }
    }
}
