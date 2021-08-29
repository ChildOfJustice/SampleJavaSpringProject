package ru.yuldashev.learning.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusicBean") Music music) {
        this.music = music;
    }
    public MusicPlayer(){}




    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }










    public String getName() {
        return name;
    }

    @Value("${musicPlayer.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }


    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music.getSong() +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
