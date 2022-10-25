package org.andrew.springtasks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> list = new ArrayList<>();

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void playMusic () {
        Random random = new Random();
        System.out.println(list.get(random.nextInt(list.size())).getSong());
    }


}
