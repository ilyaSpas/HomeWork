package org.example.project2;

public class MyThread extends Thread{
    private Person person1;
    private Person person2;

    public MyThread(Person person1, Person person2){
        this.person1 = person1;
        this.person2 = person2;
    }
    @Override
    public void run() {
        person1.throwBall(person2);
    }
}
