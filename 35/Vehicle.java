/* Example of Interface implementation. */

package shubham;

interface Moveable {
    int AVG_SPEED = 40; // Note: Corrected variable name (AVG_SPEED instead of AVG-SPEED)
    void move();
}

class Vehicle implements Moveable {
    public void move() {
        System.out.println("Average speed is " + AVG_SPEED); // Note: Corrected print statement
    }

    public static void main(String[] args) {
        Vehicle vc = new Vehicle();
        vc.move();
    }
}
