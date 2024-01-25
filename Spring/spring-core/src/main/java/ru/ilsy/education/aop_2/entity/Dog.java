package ru.ilsy.education.aop_2.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;
    private int age;
    private Human human;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    @Value("Buc")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("7")
    public void setAge(int age) {
        this.age = age;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    void makeSound() {
        System.out.println("Bark-bark!!!");
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", human=" + human +
               '}';
    }
}
