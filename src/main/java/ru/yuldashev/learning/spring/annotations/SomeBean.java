package ru.yuldashev.learning.spring.annotations;


import org.springframework.stereotype.Component;

@Component("someId")
public class SomeBean {

    @Override
    public String toString() {
        return "SomeBean - TEST COMPLETED";
    }
}
