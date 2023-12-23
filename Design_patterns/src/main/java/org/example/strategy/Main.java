package org.example.strategy;

import org.example.strategy.move.SwimmingBehavior;
import org.example.strategy.move.WalkingBehavior;
import org.example.strategy.sound.BarkingBehavior;
import org.example.strategy.sound.BeepingBehavior;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(new WalkingBehavior(), new BarkingBehavior());
        dog.doMove();
        dog.doSound();

        Duck duck = new Duck(new SwimmingBehavior(), new BeepingBehavior());
        duck.doMove();
        duck.doSound();
    }
}
