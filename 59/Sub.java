/* Example of Subclass overriden Method declaring Unchecked Exception. */

package shubham;

import java.io.*;

class Super {
    void show() {
        System.out.println("parent class");
    }
}

public class Sub extends Super {
    void show() throws ArrayIndexOutOfBoundsException {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        Super s = new Sub();
        s.show();
    }
}
