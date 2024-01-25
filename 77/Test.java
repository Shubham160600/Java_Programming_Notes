/* Example using InetAddress class. */

package shubham;

import java.net.*;

class Test {
    public static void main(String[] args) {
        try {
            // Get the local host address
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Local Host: " + address);

            // Get the InetAddress by providing the host name
            address = InetAddress.getByName("www.studyProfound.com");
            System.out.println("By Name: " + address);

            // Get all IP addresses associated with a given host name
            InetAddress[] sw = InetAddress.getAllByName("www.google.com");
            System.out.println("All Addresses for www.google.com:");
            for (int i = 0; i < sw.length; i++) {
                System.out.println(sw[i]);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
