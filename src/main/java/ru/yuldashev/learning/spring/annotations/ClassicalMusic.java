package ru.yuldashev.learning.spring.annotations;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

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
