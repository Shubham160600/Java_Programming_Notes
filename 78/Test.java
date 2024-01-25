/* Program using URL class. */

package shubham;

import java.net.*;

class Test {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.studytonight.com/index");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("File: " + hp.getFile());
    }
}
