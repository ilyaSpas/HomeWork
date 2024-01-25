package ru.ilsy.education.aop_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.education.aop_3.config.MyConfig;
import ru.ilsy.education.aop_3.entity.Dog;
import ru.ilsy.education.aop_3.entity.Human;
import ru.ilsy.education.aop_3.util.MathClass;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = context.getBean("dog", Dog.class);
        Human human = context.getBean("human", Human.class);
        MathClass mathClass = context.getBean("mathClass", MathClass.class);

        try {
            mathClass.des(3, 0);
        } catch (ArithmeticException ignored){

        }

        context.close();
    }
}
