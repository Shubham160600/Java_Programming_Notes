/* Upcasting. */

package shubham;

class Game {
    public void type() {
        System.out.println("Indoor & outdoor");
    }
}

class Cricket extends Game {
    public void type() {
        System.out.println("Outdoor game");
    }

    public static void main(String[] args) {
        Game gm = new Game();
        Cricket ck = new Cricket();

        gm.type();  // Output: Indoor & outdoor
        ck.type();  // Output: Outdoor game

        gm = ck;    // gm now refers to the Cricket object
        gm.type();  // Output: Outdoor game (calls Cricket's version of type)
    }
}
