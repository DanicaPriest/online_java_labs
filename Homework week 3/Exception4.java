public class Exception4 {
    /**
     * Exception Handling Exercise 4:
     *
     *      Demonstrate a nested try/catch.
     *
     */
    public static void main(String[] args) {
        String words = "This is a String";
        try{
            try{
                String test = words.substring(50,10);
            }catch(StringIndexOutOfBoundsException exc){
                System.out.println("first exception");
            }
            String test2 = words.substring(-1);
        }catch(StringIndexOutOfBoundsException exc){
            System.out.println("second exception");
        }

    }
}
