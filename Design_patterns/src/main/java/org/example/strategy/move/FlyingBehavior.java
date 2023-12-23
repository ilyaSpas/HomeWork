package org.example.strategy.move;

import org.example.strategy.move.MoveBehavior;

public class FlyingBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Flying");
    }
}
