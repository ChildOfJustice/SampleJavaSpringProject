package ru.yuldashev.learning.spring.annotations;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Some rock music";
    }
}
