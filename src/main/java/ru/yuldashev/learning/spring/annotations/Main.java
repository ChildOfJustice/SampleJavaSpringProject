package ru.yuldashev.learning.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigForMyApp.class);



//        SomeBean someBean = context.getBean("someId", SomeBean.class);
//        System.out.println(someBean.test());


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        System.out.println("The name of the player is: " + musicPlayer.getName());
//        System.out.println("The volume is: " + musicPlayer.getVolume());

        Device device = context.getBean(Device.class);
        System.out.println(device);

        context.close();
    }
}
