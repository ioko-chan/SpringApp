import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicalPlayer musicalPlayer = context.getBean("musicPlayer", MusicalPlayer.class);
        musicalPlayer.playMusic();

        context.close();
    }
}
