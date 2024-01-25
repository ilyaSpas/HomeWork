package ru.ilsy.education.aop_2.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Human {
    private String name;
    private int age;
    private List<Dog> pets;

    public Human() {
        pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Value("Charly")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("22")
    public void setAge(int age) {
        this.age = age;
    }

    public List<Dog> getPets() {
        return pets;
    }

    public void addPet(Dog pet) {
        pets.add(pet);
        pet.setHuman(this);
    }

    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", pets=" + pets +
               '}';
    }
}
