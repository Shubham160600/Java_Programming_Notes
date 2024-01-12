/* Example showing difference between String and StringBuffer. */

package shubham;

class Test {
    public static void main(String args[]) {
        String str = "study";
        str.concat("Profound");
        System.out.println(str); // Output: study

        StringBuffer strB = new StringBuffer("study");
        strB.append("profound");
        System.out.println(strB); // Output: studyprofound
    }
}

