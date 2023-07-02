package org.example;

public class Eagle extends Bird{

    public Eagle(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void say() {
        System.out.println("fuuuuuuueeeee*");;
    }
}
