/* Static variable vs Instance Variable. */

package shubham;

public class Test {
    static int x = 100;  // Static variable shared among all instances of the class
    int y = 100;         // Instance variable specific to each instance of the class

    public void increment() {
        x++;  // Incrementing the static variable x
        y++;  // Incrementing the instance variable y
    }

    public static void main(String[] args) {
        Test t1 = new Test();  // Creating the first instance of the Test class
        Test t2 = new Test();  // Creating the second instance of the Test class

        t1.increment();  // Incrementing x and y for the first instance
        t2.increment();  // Incrementing x and y for the second instance

        System.out.println(t2.y);    // Printing the value of y for the second instance (t2)
        System.out.println(Test.x);   // Printing the value of the static variable x (Test.x)
    }
}
