package org.example;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". Hello world, from MyThread.");
        }
    }
}
