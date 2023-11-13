package org.example.setDemon_example;

public class OtherClassesForExample extends Thread {
    public static void main(String[] args) throws InterruptedException {
        OtherClassesForExample classesForExample = new OtherClassesForExample();
        classesForExample.setDaemon(true);
        classesForExample.start();
        Thread.sleep(5000);
        System.out.println("Stop");
    }
    @Override
    public void run() {
        while (true){
            System.out.println("Hello world!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
