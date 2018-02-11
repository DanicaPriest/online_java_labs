public class ObjsEx2 {
    /**
     * Objects, Classes and Methods Exercise 2:
     * <p>
     * Create a class that demonstrates the following: (all methods below can be in the same class)
     * <p>
     * 1) A static method that calls another static method.
     * 2) A static method that calls a non-static method.
     * 3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
     * 4) A non-static method1 that calls another non-static method2 and passes a value to method2.
     */

    public static void main(String[] args) {

        print_words("banana", "fishstick"); //1) A static method that calls another static method.
        ObjsEx2 obj = new ObjsEx2(); //A static method that calls a non-static method.
        obj.not_static(67);
    }

    public static void print_words(String word1, String word2) {
        System.out.println(word1 + " " + word2);
    }

    public void not_static(int num) {
        System.out.println("I'm not static, here is a random number: " + num);
    }

    public void method1() {
        
        int result = multi(5, 9);
        System.out.println(result);

    }

    public int multi(int a, int b) {

        return a * b;


    }
    public void method2(){

    }
}

