package org.example.hw;

public class Cat extends Animal {

    private String character;

    public Cat(String name, int age, String character) {
        super(name, age);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    void getInfo() {
        System.out.printf("Кошка\n" +
                "Имя: %s\n" +
                "Возраст: %d\n" +
                "Характер: %s\n", getName(), getAge(), getCharacter());
    }

    @Override
    void makeSound() {
        System.out.println(getName() + ": Meow-meow...");
    }
}
