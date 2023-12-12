package org.example.seminar.task1;

public class Person {
    public String name;
    public int age;

    public Person() {
        this.name = "Ivan";
        this.age = 25;
    }

    public void displayInfo(){
        System.out.println("Имя: " + name + "\nВозраст: " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
