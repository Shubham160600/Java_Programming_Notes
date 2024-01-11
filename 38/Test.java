/* Example of Inner class inside a method. */

package shubham;

class Outer {
    int count;

    public void display() {
        for (int i = 0; i < 5; i++) {
            class Inner { // Inner class defined inside the for loop
                public void show() {
                    System.out.println("Inside inner " + (count++));
                }
            }
            Inner in = new Inner();
            in.show();
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.display();
    }
}
