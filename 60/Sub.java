/* Example of Subclass overriden method with same Exception. */

package shubham;

import java.io.*;

class Super {
    void show() throws Exception {
        System.out.println("parent class");
    }
}

public class Sub extends Super {
    void show() throws Exception {
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
