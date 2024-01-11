/* Example of Inner class instantiated outside Outer class. */

package shubham;

class Outer {
    int count;

    public void display() {
        Inner in = new Inner();
        in.show();
    }

    class Inner {
        public void show() {
            System.out.println("Inside inner " + (++count));
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner in = ot.new Inner();
        in.show();
    }
}
