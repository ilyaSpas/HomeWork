package org.example.hw;

public class Philosopher extends Thread {
    private String name;
    private Table table;
    private int hungry;
    private int amountForks;


    public Philosopher(Table table, String name) {
        amountForks = 0;
        hungry = 3;
        this.table = table;
        this.name = name;
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
                System.out.println(name + " хочет есть.");
                tryGetTwoForks();
                if (amountForks == 2){
                    System.out.print(name + " ест.\n");
                    hungry--;
                    returnTwoForks();
                }
                if (amountForks == 1){
                    returnOneFork();
                }
            }
            sleep(1000);
        }
        System.out.println(name + " - сыт.");
    }

    private void returnOneFork(){
        table.returnFork();
        amountForks--;
    }

    private void returnTwoForks() {
        table.returnFork();
        table.returnFork();
        amountForks = 0;
    }

    private void tryGetTwoForks() {
        if (table.getAmountForks() > 0){
                table.getFork();
                amountForks++;
        }
        if (table.getAmountForks() > 0){
                table.getFork();
                amountForks++;
        }
    }

}
