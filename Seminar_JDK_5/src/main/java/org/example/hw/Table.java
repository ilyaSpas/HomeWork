package org.example.hw;

import java.util.ArrayList;
import java.util.List;


public class Table extends Thread {
    private List<Philosopher> philosophers;
    private volatile int amountForks;

    public Table() {
        philosophers = new ArrayList<>();
        amountForks = 6;
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

    public int getAmountForks() {
        return amountForks;
    }

    public void getFork() {
        if(amountForks > 0){
            amountForks--;
        }
    }
    public void returnFork(){
        if (amountForks < 6){
            amountForks++;
        }
    }
}
