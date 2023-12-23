package org.example.strategy;

import org.example.strategy.move.MoveBehavior;
import org.example.strategy.sound.SoundBehavior;

public class Dog extends Animal {
    public Dog(MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(moveBehavior, soundBehavior);
    }
}
