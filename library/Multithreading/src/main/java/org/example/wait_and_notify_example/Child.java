package org.example.wait_and_notify_example;

public class Child extends Thread {
    private String name;
    private BasketOfCandies basket;

    public Child(BasketOfCandies basket ,String name) {
        this.basket = basket;
        this.name = name;
    }

    public String getChildName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            basket.takeCandies(this);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
