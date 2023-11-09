package org.example.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Table extends Thread {
    private List<Philosopher> philosophers;
    private List<Fork> forks;

    public Table() {
        philosophers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            philosophers.add(new Philosopher(this,(i + 1) + ". Философ"));
        }
    }

    @Override
    public void run() {
            for (Philosopher philosopher : philosophers) {
                philosopher.start();
            }
    }
}
