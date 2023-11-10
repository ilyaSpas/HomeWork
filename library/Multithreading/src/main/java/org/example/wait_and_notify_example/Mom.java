package org.example.wait_and_notify_example;

public class Mom extends Thread {
    private String name;
    private BasketOfCandies basket;

    public Mom(BasketOfCandies basket) {
        this.basket = basket;
        this.name = "Мом";
    }

    public String getMomName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            basket.putCandies(this);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
