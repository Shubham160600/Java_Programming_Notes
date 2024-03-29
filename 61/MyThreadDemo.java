/* Implementing the Runnable Interface. */

package shubham;

class MyThread implements Runnable {
    public void run() {
        System.out.println("concurrent thread started running..");
    }
}

class MyThreadDemo {
    public static void main(String args[]) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
