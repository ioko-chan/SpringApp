public class MusicalPlayer {
    private  Music music;
    public MusicalPlayer(Music music){
        this.music=music;
    }

    public void playMusic(){
        System.out.printf("Playing "+ music.getSong());
    }
}