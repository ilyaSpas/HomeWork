package org.example.strategy.move;

import org.example.strategy.move.MoveBehavior;

public class WalkingBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Walking");
    }
}
