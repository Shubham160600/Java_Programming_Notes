/* Annonymous class. */

package shubham;

interface Animal {
    void type();
}

public class ATest {
    public static void main(String args[]) {
        Animal an = new Animal() { // Anonymous class created
            public void type() {
                System.out.println("Anonymous animal");
            }
        };

        an.type();
    }
}
