package ru.yuldashev.learning.spring.depInjection;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Some rock music";
    }
}
