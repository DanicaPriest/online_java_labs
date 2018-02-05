public class Ex4 {

    /**
     * Fundamentals Exercise 4: Area and Perimeter
     *
     *      Write the necessary code to calculate the area and perimeter of a cylinder
     *      with a radius of 3.14 and a height of 5. Print out the result.
     *
     *
     *
     */



        public static void main(String[] args) {

            // write code here
            double r = 3.14;
            double h = 5;
             double p = 3.14;
            double rsq = r * r;

double a = (2*p*r*h) + (2*p*rsq);
double pr =  2 * (r + r) + 2 * h;
            System.out.println("The area of the cylinder is " + a);
            System.out.println("The perimeter of the cylinder is " + pr);


        }

}
