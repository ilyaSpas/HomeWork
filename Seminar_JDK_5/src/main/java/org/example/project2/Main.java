package org.example.project2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jimmy");
        Person person2 = new Person("Timmy");

        MyThread myThread1 = new MyThread(person1, person2);
        MyThread myThread2 = new MyThread(person2, person1);

        myThread1.start();
        myThread2.start();
    }
}
