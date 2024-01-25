package ru.ilsy.education.aop.test_for_order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.education.aop.test_for_order.config.Configure;
import ru.ilsy.education.aop.test_for_order.entity.Dog;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
        Dog dog = context.getBean("dog", Dog.class);
        dog.makeSound();
    }
}
