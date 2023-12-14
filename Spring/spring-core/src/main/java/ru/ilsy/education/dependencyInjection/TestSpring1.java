package ru.ilsy.education.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilsy.education.MusicPlayer;

public class TestSpring1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer3", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
