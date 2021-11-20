import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        /*MusicalPlayer firstMusicalPlayer = context.getBean("musicPlayer", MusicalPlayer.class);
        MusicalPlayer secondMusicalPlayer = context.getBean("musicPlayer",MusicalPlayer.class);

        secondMusicalPlayer.setVolume(17);
        System.out.println(firstMusicalPlayer.getVolume());
        System.out.println(secondMusicalPlayer.getVolume())*/;

        context.close();
    }
}
