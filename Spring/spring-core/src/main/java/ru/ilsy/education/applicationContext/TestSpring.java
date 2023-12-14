package ru.ilsy.education.applicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilsy.education.applicationContext.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        TestBean testBean;
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {
            testBean = context.getBean("testBean", TestBean.class);
            System.out.println(testBean.getName());
        }


    }
}
