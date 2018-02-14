class Race {
    double miles;
    String terrain;
    String medal;

    Race(double mi, String t, String md) {
        miles = mi;
        terrain = t;
        medal = md;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }
}

class Race_metric {
    double kilometers;
    String terrain;
    String medal;


    Race_metric(double km, String t, String md) {
        kilometers = km;
        terrain = t;
        medal = md;
    }

}

class Pace {
    public static double km_to_mile(double km) {
        return km * 0.621371;
    }

    public static double miles_to_km(double miles) {
        return miles * 1.609344;
    }

    public static void main(String[] args) {
        double a = miles_to_km(10);
        System.out.println(a);
        Race mcm = new Race(26.2, "road", "blue");
        mcm.setMedal("red");
        String s = mcm.getTerrain(); 

    }


}
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
