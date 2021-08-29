package ru.yuldashev.learning.spring.depInjection;

public class ClassicalMusic implements Music{

    public void initialization(){
        System.out.println("Bean initialized");
    }
    public void destroy(){
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Some classical music";
    }
}
