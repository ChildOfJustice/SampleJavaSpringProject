package ru.yuldashev.learning.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Device {
    private MusicPlayer musicPlayer;
    private SomeBean someBean;

    @Autowired
    public Device(MusicPlayer musicPlayer, SomeBean someBean){
        this.musicPlayer = musicPlayer;
        this.someBean = someBean;
    }

    @Override
    public String toString() {
        return "Device{" +
                "musicPlayer=" + musicPlayer +
                ", someBean=" + someBean +
                '}';
    }
}
