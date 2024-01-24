/* Extending Thread class. */

package shubham;

class MyThread extends Thread {
    public void run() {
        System.out.println("Concurrent thread started running..");
    }
}

class MyThreadDemo {
    public static void main(String args[]) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
