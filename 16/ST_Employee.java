/* Static block. */

package shubham;

class ST_Employee {
    int eid;
    String name;
    static String company_name;

    static {
        company_name = "Profound"; // Static block invoked before the main() method
    }

    public void show() {
        System.out.println(eid + " " + name + " " + company_name);
    }

    public static void main(String[] args) {
        ST_Employee se1 = new ST_Employee();
        se1.eid = 104;
        se1.name = "Abhijit";
        se1.show();
    }
}
