/* Abstract class with concrete(normal) method. */

package shubham;

class B extends A {
    void callme() {
        System.out.println("This is callme.");
    }

    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.normal();
    }
}
