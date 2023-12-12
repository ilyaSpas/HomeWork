package org.example.hw;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void getInfo() {
        System.out.printf("Собака\n" +
                "Имя: %s\n" +
                "Возраст: %d лет.\n" +
                "Порода: %s\n", getName(), getAge(), getBreed());
    }

    @Override
    void makeSound() {
        System.out.println(getName() + ": Bark-bark!!!");
    }
}
