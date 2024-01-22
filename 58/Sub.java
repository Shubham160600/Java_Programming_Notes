/* Example of Subclass overriden Method declaring Checked Exception. */

package shubham;

import java.io.*;

class Super {
    void show() {
        System.out.println("parent class");
    }
}

public class Sub extends Super {
    void show() {
        System.out.println("sub class");
    }

    public static void main(String[] args) {
        Super s = new Sub();
        s.show();
    }
}
