/* static variable. */

package shubham;

class ST_Employee {
    int eid;
    String name;
    static String company_name = "Profound";

    public void show() {
        System.out.println(eid + " " + name + " " + company_name);
    }

    public static void main(String[] args) {
        // Creating the first employee object
        ST_Employee se1 = new ST_Employee();
        se1.eid = 104;
        se1.name = "Abhijit";
        se1.show();

        // Creating the second employee object
        ST_Employee se2 = new ST_Employee();
        se2.eid = 108;
        se2.name = "Ankit";
        se2.show();
    }
}
