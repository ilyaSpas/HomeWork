package org.example.wait_and_notify_example;

public class Child extends Thread {
    private String name;
    private BasketOfCandies basket;
    private int eatenCandies;

    public Child(BasketOfCandies basket ,String name) {
        eatenCandies = 0;
        this.basket = basket;
        this.name = name;
    }

    public String getChildName() {
        return name;
    }

    public void eat(){
        eatenCandies++;
    }

    public int getEatenCandies() {
        return eatenCandies;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            basket.takeCandie(this);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
