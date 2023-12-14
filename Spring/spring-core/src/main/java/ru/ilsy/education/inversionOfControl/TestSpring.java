package ru.ilsy.education.inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilsy.education.Music;
import ru.ilsy.education.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();

    }
}
