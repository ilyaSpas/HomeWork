package org.example.strategy.move;

public class SwimmingBehavior implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}
