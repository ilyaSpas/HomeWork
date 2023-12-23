package org.example.strategy;

import org.example.strategy.move.MoveBehavior;
import org.example.strategy.sound.SoundBehavior;

public abstract class Animal {
    private MoveBehavior moveBehavior;
    private SoundBehavior soundBehavior;

    public Animal(MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        this.moveBehavior = moveBehavior;
        this.soundBehavior = soundBehavior;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public void doMove(){
        moveBehavior.move();
    }
    public void doSound(){
        soundBehavior.makeSound();
    }
}
