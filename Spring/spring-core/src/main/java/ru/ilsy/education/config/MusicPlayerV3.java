package ru.ilsy.education.config;

import org.springframework.beans.factory.annotation.Value;
import ru.ilsy.education.Music;

public class MusicPlayerV3 {

    private int volume;

    private Music music;

    public MusicPlayerV3(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playSong() {
        System.out.println(music.getSong());
        System.out.println("Volume is " + volume);
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
