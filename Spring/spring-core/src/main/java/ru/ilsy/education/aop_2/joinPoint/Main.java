package ru.ilsy.education.aop_2.joinPoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.education.aop_2.config.ConfigurationAop2;
import ru.ilsy.education.aop_2.entity.Dog;
import ru.ilsy.education.aop_2.entity.Human;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAop2.class);
        Human djo = context.getBean("human", Human.class);
        Dog dog = context.getBean("dog", Dog.class);

        dog.setName("Rick");
    }
}
