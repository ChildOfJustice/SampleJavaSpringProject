package ru.yuldashev.learning.spring.annotations;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ru.yuldashev.learning.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfigForMyApp {
    //Create bean manually:
    @Bean
    public ClassicalMusic classicalMusicBean(){ // bean id is "classicalMusicBean"
        return new ClassicalMusic();
    }


    //Dependency injection:
    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusicBean());
    }





}
