public class dataEx2 {
    /**
     * Data Types and Operators Exercise 2: Type conversion and casting
     *
     *      Write the necessary code to demonstrate type conversion:
     *
     *      Widening:
     *      1. Declare and initialize an int with the value 10
     *      2. Declare a double and set it equal to the int
     *      3. Print out the double
     *
     *      Narrowing (with casting):
     *      1. Declare and initialize a new double with the value 10.5
     *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
     *      3. Print out the int
     *
     *      Notice how each type is converted. In which direction is information lost?
     *
     */
    public static void main(String[] args){
        int intface = 10;
        double doubley = intface;
        System.out.println(doubley);

        double doubleh = 10.5;
        int inty = (int)doubleh;
        System.out.println(inty);


    }
}
