package org.example;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        thread.join();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
    }
}
