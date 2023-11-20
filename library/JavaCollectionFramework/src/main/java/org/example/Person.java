package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        age = (int) ((Math.random() * (35 - 18)) + 18);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: "+ age;
    }
}
