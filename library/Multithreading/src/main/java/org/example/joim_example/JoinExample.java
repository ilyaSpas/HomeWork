package org.example.joim_example;

import org.example.simple_threads.MyRunnable;
import org.example.simple_threads.MyThread;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(new MyRunnable());

        thread.start();
        thread.join();
        thread1.start();
    }
}
