/* Example of Generic method. */

package shubham;

class GenTest {
    static <V, T> void display(V v, T t) {
        System.out.println(v.getClass().getName() + " = " + v);
        System.out.println(t.getClass().getName() + " = " + t);
    }

    public static void main(String[] args) {
        display(88, "This is string");
    }
}
