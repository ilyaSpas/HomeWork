package ru.ilsy.education.lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilsy.education.Music;
import ru.ilsy.education.MusicPlayer;

import java.lang.annotation.Annotation;

public class TesSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music musicBean2 = context.getBean("musicBean3", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean2);
        musicPlayer.setVolume(30);
        musicPlayer.playMusic();
        context.close();

    }
}
