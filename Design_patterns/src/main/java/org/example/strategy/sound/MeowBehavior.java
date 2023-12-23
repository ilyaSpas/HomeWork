package org.example.strategy.sound;

public class MeowBehavior implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Moew-Moew");
    }
}
