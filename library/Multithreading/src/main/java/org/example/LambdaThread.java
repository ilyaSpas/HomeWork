package org.example;

public class LambdaThread {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello world!");
        }).start();
    }
}
