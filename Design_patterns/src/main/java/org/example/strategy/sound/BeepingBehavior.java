package org.example.strategy.sound;

public class BeepingBehavior implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Beep-beep");
    }
}
