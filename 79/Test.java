/* Example of Generic class. */

package shubham;

class Gen<T> {
    T ob; // an object of type T is declared

    Gen(T o) // constructor
    {
        ob = o;
    }

    public T getOb() {
        return ob;
    }
}

class Test {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(100); // instance of Integer type Gen Class.
        int x = iob.getOb();
        System.out.println(x);

        Gen<String> sob = new Gen<>("Hello"); // instance of String type Gen Class.
        String str = sob.getOb();
        System.out.println(str);
    }
}
