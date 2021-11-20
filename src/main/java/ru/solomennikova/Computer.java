package ru.solomennikova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private  int id;
    private  MusicalPlayer musicalPlayer;

    @Autowired
    public Computer(MusicalPlayer musicalPlayer) {
        this.id=1;
        this.musicalPlayer = musicalPlayer;
    }

    @Override
    public String toString() {
        return "Computer[" +
                 + id + "] " +
                 musicalPlayer.playMusic();
    }
}
