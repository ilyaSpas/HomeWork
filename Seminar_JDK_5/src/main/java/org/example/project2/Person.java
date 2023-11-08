package org.example.project2;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public synchronized void throwBall(Person person){
        System.out.println(name + " бросил мяч " + person.getName() + ".");
        person.catchBall(person);
    }
    public void catchBall(Person person){
        System.out.println(person.getName() + " поймал мяч.");
    }
}
