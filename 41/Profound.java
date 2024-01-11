/* indexOf(). */

package shubham;

public class Profound {
    public static void main(String[] args) {
        String str = "Profound";

        // 1st form: indexOf(char ch)
        System.out.println(str.indexOf('u')); 

        // 2nd form: indexOf(char ch, int fromIndex)
        System.out.println(str.indexOf('t', 3)); 

        String subString = "Ton";

        // 3rd form: indexOf(String str)
        System.out.println(str.indexOf(subString)); 

        // 4th form: indexOf(String str, int fromIndex)
        System.out.println(str.indexOf(subString, 7)); 
    }
}
