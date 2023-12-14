package ru.ilsy.education.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayerV2 musicPlayerV2 = context.getBean("musicPlayerV2", MusicPlayerV2.class);
        musicPlayerV2.playMusic();
        context.close();
    }
}
