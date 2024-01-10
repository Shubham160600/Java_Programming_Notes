/* Example of Child class refering Parent class property using super keyword. */

package shubham;

class Parent {
    String name;
}

public class Child extends Parent {
    String name;

    public void details() {
        super.name = "Parent"; // refers to the parent class member
        name = "Child";
        System.out.println(super.name + " and " + name);
    }

    public static void main(String[] args) {
        Child cobj = new Child();
        cobj.details();
    }
}
