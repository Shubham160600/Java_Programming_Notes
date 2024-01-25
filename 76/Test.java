/* Example of Autoboxing and Unboxing. */

package shubham;

class Test {
    public static void main(String[] args) {
        Integer iob = 100; // Autoboxing of int
        int i = iob; // Unboxing of Integer
        System.out.println(i + " " + iob);

        Character cob = 'a'; // Autoboxing of char
        char ch = cob; // Auto-unboxing of Character
        System.out.println(cob + " " + ch);
    }
}
