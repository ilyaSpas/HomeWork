package org.example.strategy.sound;

public class BarkingBehavior implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Bark-bark");
    }
}
