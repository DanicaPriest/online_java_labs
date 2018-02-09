public class conEx8 {
    /**
     * Conditions and Loops Exercise 8: do-while loop
     *
     *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
     *
     */
    public static void main(String[] args){
int i = 1000;
do {if (i % 3 == 0)
    System.out.println(i); i--;

}while (i > 0);
    }
}
