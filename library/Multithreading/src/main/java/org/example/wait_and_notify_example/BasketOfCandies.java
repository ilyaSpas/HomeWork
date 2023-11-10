package org.example.wait_and_notify_example;

public class BasketOfCandies {
    private volatile int amountOfCandies;
    private final int maxSizeOfBasket = 20;

    public BasketOfCandies() {
        amountOfCandies = 10;
    }

    public synchronized void takeCandie(Child child) {
        if (amountOfCandies <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            amountOfCandies--;
            child.eat();
            System.out.println(child.getChildName() + " берет конфету.");
            System.out.println("В корзине осталось " + amountOfCandies + " конфет.");
            System.out.println(child.getChildName() + " сьел " + child.getEatenCandies() + " конфет.");
            notify();
        }
    }

    public synchronized void putCandie(Mom mom) {
        if (amountOfCandies == maxSizeOfBasket) {
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
