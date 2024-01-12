/* Uncaught Exceptions. */

package shubham;

public class UncaughtException {
    public static void main(String args[]) {
        int a = 0;

        try {
            int b = 7 / a; // Divide by zero, will lead to exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}
