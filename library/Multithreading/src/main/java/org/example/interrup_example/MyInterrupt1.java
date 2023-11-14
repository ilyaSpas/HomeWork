package org.example.interrup_example;

public class MyInterrupt1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MyInterrupt1 interrupt1 = new MyInterrupt1();
        MyInterrupt2 interrupt2 = new MyInterrupt2(interrupt1);

        interrupt1.start();
        interrupt2.start();
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Hello world!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Процесс прерван.");
                interrupt();
            }
        }
    }
}
