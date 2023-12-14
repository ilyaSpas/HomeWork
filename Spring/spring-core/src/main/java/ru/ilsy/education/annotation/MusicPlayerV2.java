package ru.ilsy.education.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.ilsy.education.Music;

@Component
@Scope("singleton")
public class MusicPlayerV2 {

    public Music music;
    public int volume;

    @Autowired
    public MusicPlayerV2(@Qualifier("technoMusic") Music music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
        System.out.println("Volume: " + volume);
    }
}
