/* Example of Subclass overriden method with parent Exception. */

package shubham;

import java.io.*;

public class Sub extends Super {
    void show() throws ArithmeticException {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        try {
            Super s = new Sub();
            s.show();
        } catch (Exception e) {
        }
    }
}
