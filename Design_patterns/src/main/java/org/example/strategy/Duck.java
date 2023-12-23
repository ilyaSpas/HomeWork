package org.example.strategy;

import org.example.strategy.move.MoveBehavior;
import org.example.strategy.sound.SoundBehavior;

public class Duck extends Animal{
    public Duck(MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(moveBehavior, soundBehavior);
    }
}
