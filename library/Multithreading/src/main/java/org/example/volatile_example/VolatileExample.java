package org.example.volatile_example;

public class VolatileExample extends Thread {
    private int counter;
    private volatile boolean running;

    public VolatileExample() {
        counter = 1;
        running = true;
    }

    @Override
    public void run() {
        while (running) {
            counter++;
        }
        System.out.println("Счетчик - " + counter);
    }

    public void stopRunning() {
        running = false;
    }

    public int getCounter() {
        return counter;
    }
}
