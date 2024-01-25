package ru.ilsy.education.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Dog dog = context.getBean("dog", Dog.class);
        dog.setName("Dog");

        Cat cat = context.getBean("cat", Cat.class);
        cat.setName("Cat");

//        dog.makeSound();
//        dog.makeMove();
//
//        cat.makeSound();
//        cat.makeMove();

        Human human = context.getBean("human", Human.class);
        human.greetPet(dog);
        human.greetPet(cat);
        human.feedPet(dog);
        human.feedPet(cat);
    }
}
