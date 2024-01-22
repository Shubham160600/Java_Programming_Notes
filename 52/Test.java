/*Example without using try with Resource Statement.*/  

package shubham;
 
import java.io.*;

class Test {
    public static void main(String[] args) {
        try {
            String str;
            // Opening file in read mode using BufferedReader stream
            BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"));
            
            // Reading lines from the file and printing them to the console
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            
            // Closing BufferedReader stream
            br.close();
        } catch (IOException ie) {
            System.out.println("exception");
        }
    }
}
