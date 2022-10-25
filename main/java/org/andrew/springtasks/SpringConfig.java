package org.andrew.springtasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public Jazz jazz(){
        return new Jazz();
    }

    @Bean
    public Classic classic(){
        return new Classic();
    }

    @Bean
    public Rock rock(){
        return new Rock();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rock(), classic(), jazz());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }


}
