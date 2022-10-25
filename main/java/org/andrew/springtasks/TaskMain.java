package org.andrew.springtasks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();



    }
}
