package ru.yuldashev.learning.spring.oneBin;

public class TestBean {
    private String name;

    private TestBean(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
