/* accessing non-static variable from a static context. */

package shubham;

class Test {
    int x;

    public static void main(String[] args) {
        Test testObject = new Test(); // Create an instance of the Test class
        testObject.x = 10;             // Access the instance variable through the instance
    }
}
