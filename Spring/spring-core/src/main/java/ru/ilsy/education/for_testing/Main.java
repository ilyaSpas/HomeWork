package ru.ilsy.education.for_testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.education.config.SpringConfiguration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Test test = context.getBean("testBean", Test.class);
//        test.checkBean();
        Test2 test2 = context.getBean("test2", Test2.class);
        test2.checkBean();
    }
}
