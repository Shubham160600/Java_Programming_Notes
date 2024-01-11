/* Abstract class with concrete(normal) method. */

package shubham;

abstract class A {
    abstract void callme();

    public void normal() {
        System.out.println("This is a concrete method");
    }
}
