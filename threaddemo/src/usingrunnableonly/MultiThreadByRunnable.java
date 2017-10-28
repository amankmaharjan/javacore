package usingrunnableonly;

class MultiThreadByRunnable implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MultiThreadByRunnable m1 = new MultiThreadByRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}