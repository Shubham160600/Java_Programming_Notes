/* Abstraction using abstract class. */

package shubham;

abstract class Vehicle {
    public abstract void engine();
}

public class Car extends Vehicle {
    public void engine() {
        System.out.println("Car engine"); // Car engine implementation
    }

    public static void main(String[] args) {
        Vehicle v = new Car(); // Polymorphic reference
        v.engine(); // Calls the overridden engine method in Car
    }
}

