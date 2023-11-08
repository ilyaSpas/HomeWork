package org.example.project1;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new MyRunnable());

        myThread.start();
        Thread.sleep(500);
        thread.start();

        thread.join();
        myThread.join();



//        Thread.sleep(5000);
//        myThread.interrupt();
    }
}