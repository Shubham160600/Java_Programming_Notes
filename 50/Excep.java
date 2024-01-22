/*Example for Unreachable Catch block.*/  

package shubham;
 
class Excep {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2};
            arr[2] = 3 / 0; // This line will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound exception");
        } catch (Exception e) {
            System.out.println("Generic exception");
        }
    }
}
