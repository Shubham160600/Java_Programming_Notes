/* constructor chaining. */

package shubham;

class Test {
    Test() {
        this(10);  // Calls the parameterized constructor with value 10
    }

    Test(int x) {
        System.out.println("x=" + x);
    }

    public static void main(String arg[]) {
        Test object = new Test();  // Calls the default constructor
    }
}
