package org.example.simple_threads;

public class LambdaThread {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello world!");
        }).start();
    }
}
