package usingthreadonly;

class MultiThreadByThreadOnly extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        MultiThreadByThreadOnly t1=new MultiThreadByThreadOnly();
        t1.start();
    }
}