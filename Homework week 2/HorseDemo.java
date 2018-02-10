class Unicorn {

    String body_color;
    String hair_color;
    int wings;

    Unicorn(String bc, String hc, int w) {
        body_color = bc;
        hair_color = hc;
        wings = w;
    }


}

class Pony {

    String body_color;
    String hair_color;
    int legs;

    Pony(String bc, String hc, int l) {
        body_color = bc;
        hair_color = hc;
        legs = l;
    }


}


class HorseDemo {
    public static void main(String[] args) {
        Unicorn moonbeam = new Unicorn("periwinkle", "indigo", 2);
        Pony sparklebutt = new Pony("rainbow", "pink", 4);
        System.out.println("Moonbeam is " + moonbeam.body_color + " with " + moonbeam.hair_color + " hair and has " + moonbeam.wings + " wings.");
        System.out.println("Sparklebutt is " + sparklebutt.body_color + " with " + sparklebutt.hair_color + " hair and has " + sparklebutt.legs + " legs.");
    sparklebutt.body_color = "glitter";
    sparklebutt.hair_color = "fairydust";
        System.out.println("Sparklebutt is " + sparklebutt.body_color + " with " + sparklebutt.hair_color + " hair.");

    }


}
/**
 * Objects, Classes and Methods Exercise 1:
 * <p>
 * Create three classes, all of which can be inside this file. The first class (the controller)
 * should have the main method. The main method should create at least two objects using the
 * constructors of the second and third class. The second and third class should each have at least
 * three instance variables that should be set using the constructor when an object is created.
 * <p>
 * Once the objects are created, try changing the values of some of the instance variables.
 * <p>
 * Think about some of the examples we have seen from the lectures or Confluence Docs.
 * <p>
 * Be creative. Have some fun. Using Java objects you can model just about anything you want.
 * Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */





