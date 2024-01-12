/* Example of StringBuilder. */

package shubham;

class Test {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("study");

        // Append "tonight" to the StringBuilder
        str.append("tonight");
        System.out.println(str); // Output: studytonight

        // Replace the substring from index 6 to 13 with "today"
        str.replace(6, 13, "today");
        System.out.println(str); // Output: studytoday

        // Reverse the contents of the StringBuilder
        str.reverse();
        System.out.println(str); // Output: yadotyduts

        // Replace the substring from index 6 to 13 with "today" again
        str.replace(6, 13, "today");
    }
}

