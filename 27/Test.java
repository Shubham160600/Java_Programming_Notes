/*  More example of instanceof operator. */
 	
package shubham;

class Parent {}

class Child1 extends Parent {}

class Child2 extends Parent {}

class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        System.out.println(c1 instanceof Parent); // true
        System.out.println(c2 instanceof Parent); // true
        System.out.println(p instanceof Child1);   // false
        System.out.println(p instanceof Child2);   // false

        p = c1;
        System.out.println(p instanceof Child1);   // true
        System.out.println(p instanceof Child2);   // false

        p = c2;
        System.out.println(p instanceof Child1);   // false
        System.out.println(p instanceof Child2);   // true
    }
}
