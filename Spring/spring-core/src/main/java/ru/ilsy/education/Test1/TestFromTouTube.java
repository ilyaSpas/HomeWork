package ru.ilsy.education.Test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestFromTouTube {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dot dot1 = context.getBean("getDot", Dot.class);
        Dot dot2 = context.getBean("getDot", Dot.class);
        Dot dot3 = context.getBean("getDot", Dot.class);
        Dot dot4 = context.getBean("getDot", Dot.class);
    }
}
