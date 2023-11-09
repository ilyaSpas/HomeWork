package org.example.hw;

public class Philosopher extends Thread {
    private String name;
    private Table table;
    private int hungry;


    public Philosopher(Table table, String name) {
        hungry = 3;
        this.table = table;
        this.name = name;
    }

    public String getPhilosopherName() {
        return name;
    }

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    @Override
    public void run() {
        try {
            this.philosopherWish();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void philosopherWish() throws InterruptedException {
        while (hungry > 0) {
            if (getRandomBoolean()) {
                System.out.println(name + " размышляет.");
            } else {
                System.out.println(name + " ест.");
                hungry--;
            }
            sleep(1000);
        }
        System.out.println(name + " - сыт.");
    }

}
