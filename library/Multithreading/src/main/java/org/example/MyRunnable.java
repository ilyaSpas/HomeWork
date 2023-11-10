package org.example;

public class MyRunnable implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". Hello world, form MyRunnable.");
        }
    }
}
