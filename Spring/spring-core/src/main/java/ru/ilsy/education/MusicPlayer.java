package ru.ilsy.education;

import java.util.List;

public class MusicPlayer {

    private Music music;

    private int volume;

    private List<Music> musicList;
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){

    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
        System.out.println("Volume: " + volume);
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public int getVolume () {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
