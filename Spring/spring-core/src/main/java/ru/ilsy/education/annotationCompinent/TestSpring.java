package ru.ilsy.education.annotationCompinent;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilsy.education.Music;
import ru.ilsy.education.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music newMusic = context.getBean("jazzMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(newMusic);
        musicPlayer.playMusic();
        context.close();
    }
}
