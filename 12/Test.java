/* gc() method. */

package shubham;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();  // Creating an instance of the Test class
        t = null;  // Assigning null to the reference variable, making the object eligible for garbage collection
        System.gc();  // Explicitly invoking the garbage collector
    }

    public void finalize() {
        System.out.println("Garbage Collected");
    }
}
