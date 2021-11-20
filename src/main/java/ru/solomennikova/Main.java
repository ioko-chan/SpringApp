package ru.solomennikova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic",Music.class);
        MusicalPlayer musicalPlayer = new MusicalPlayer(music);
        musicalPlayer.playMusic();

        Music music1 = context.getBean("classicalMusic",Music.class);
        MusicalPlayer musicalPlayer1 = new MusicalPlayer(music1);
        musicalPlayer1.playMusic();
        context.close();
    }
}
