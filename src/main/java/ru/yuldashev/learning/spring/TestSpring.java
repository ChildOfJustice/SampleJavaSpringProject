package ru.yuldashev.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.yuldashev.learning.spring.depInjection.Music;
import ru.yuldashev.learning.spring.depInjection.MusicPlayer;
import ru.yuldashev.learning.spring.oneBin.TestBean;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println("The name of the player is: " + musicPlayer.getName());
        System.out.println("The volume is: " + musicPlayer.getVolume());

        context.close();
    }


//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//
//        System.out.println(testBean.getName());
//
//        context.close();
//    }

}
