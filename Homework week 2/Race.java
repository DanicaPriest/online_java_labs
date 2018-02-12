public class Race {
    double miles;
    String terrain;
    String medal;

    Race(double mi, String t, String md) {
        miles = mi;
        terrain = t;
        medal = md;
    }


}

public class Race_metric {
    double kilometers;
    String terrain;
    String medal;


    Race_metric(double km, String t, String md) {
        kilometers = km;
        terrain = t;
        medal = md;
    }

}

public class Pace {
    public double km_to_mile(double km) {
        return km * 0.621371;
    }

    public double miles_to_km(double miles) {
        return miles * 1.609344;
    }
    double a = miles_to_km(10);
 System.out.println(a);
/**
 * Objects, Classes and Methods Exercise 3:
 * <p>
 * Create at least three example classes (class1, class2, class3) that demonstrate comfort
 * in creating multiple classes with multiple methods, and then call between those methods across classes.
 * These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 * 1) Class1 should have the main method.
 * 2) The main method then needs to create an object of class1, class2, class3.
 * 3) The main method should then  call one or more non-static methods in class2 and class3.
 */