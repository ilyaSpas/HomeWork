package ru.ilsy.education.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilsy.education.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("scopeBean", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("scopeBean", MusicPlayer.class);

        musicPlayer1.setVolume(0);

        musicPlayer1.playMusic();
        musicPlayer.playMusic();

        context.close();
    }
}
