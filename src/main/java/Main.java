import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicalPlayer firstMusicalPlayer = context.getBean("musicPlayer", MusicalPlayer.class);
        MusicalPlayer secondMusicalPlayer = context.getBean("musicPlayer",MusicalPlayer.class);

        secondMusicalPlayer.setVolume(17);
        System.out.println(firstMusicalPlayer.getVolume());
        System.out.println(secondMusicalPlayer.getVolume());

        context.close();
    }
}
