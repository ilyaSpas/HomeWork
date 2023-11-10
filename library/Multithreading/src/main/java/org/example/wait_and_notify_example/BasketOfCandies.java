package org.example.wait_and_notify_example;

public class BasketOfCandies {
    private volatile int amountOfCandies;
    private final int maxSizeOfBasket = 20;

    public BasketOfCandies() {
        amountOfCandies = 10;
    }

    public int getAmountOfCandies() {
        return amountOfCandies;
    }

    public int getMaxSizeOfBasket() {
        return maxSizeOfBasket;
    }

    public synchronized void takeCandies(Child child){
        if (amountOfCandies <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        amountOfCandies--;
        System.out.println(child.getChildName() + " берет конфету.");
        System.out.println("В корзине осталось " + amountOfCandies + " конфет.");
        notify();
    }

    public synchronized void putCandies(Mom mom) {
        if (amountOfCandies == maxSizeOfBasket){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        amountOfCandies++;
        System.out.println(mom.getMomName() + " положила конфету.");
        System.out.println("В корзине осталось " + amountOfCandies + " конфет.");
        notify();
    }
}
