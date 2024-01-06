/* constructor overloading. */

package shubham;

class Cricketer {
    String name;
    String team;
    int age;

    // Default constructor
    Cricketer() {
        name = "";
        team = "";
        age = 0;
    }

    // Overloaded constructor
    Cricketer(String n, String t, int a) {
        name = n;
        team = t;
        age = a;
    }

    // Copy constructor
    Cricketer(Cricketer ckt) {
        name = ckt.name;
        team = ckt.team;
        age = ckt.age;
    }

    public String toString() {
        return "This is " + name + " of " + team;
    }
}

public class Test {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer("Sachin", "India", 32);
        Cricketer c3 = new Cricketer(c2);

        System.out.println(c2);
        System.out.println(c3);

        c1.name = "Virat";
        c1.team = "India";
        c1.age = 32;

        System.out.println(c1);
    }
}
