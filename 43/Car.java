/* toString(). */

package shubham;

public class Car {
    public static void main(String args[]) {
        Car c = new Car(); // Creating an instance of the Car class
        System.out.println(c); // Printing the string representation of the Car object
    }

    public String toString() {
        return "This is my car object";
    }
}
