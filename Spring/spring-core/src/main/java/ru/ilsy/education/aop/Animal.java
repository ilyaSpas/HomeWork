package ru.ilsy.education.aop;

public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    abstract void makeSound();

    abstract void makeMove();
}
