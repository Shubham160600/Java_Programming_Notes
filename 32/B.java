/* Example of Abstract class. */

package shubham;

class B extends A {
    void callme() {
        System.out.println("This is callme.");
    }

    public static void main(String[] args) {
        B b = new B();
        b.callme();
    }
}