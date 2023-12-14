package ru.ilsy.education.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MusicPlayerV3 musicPlayerV3 = context.getBean("musicPlayerBean", MusicPlayerV3.class);
        musicPlayerV3.playSong();
        context.close();
    }
}
