package SongFolder;
import java.util.ArrayList;

public class FrenchState extends State{

    private static String TWINKLE_FILE_NAME = "twinkle-french.txt";
    private static String HAPPY_FILE_NAME = "happy-french.txt";
    
    public FrenchState(MusicBox box){
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }
    
    @Override
     public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("happy-french.txt");
        box.playSong("Happy in French", lyrics);
    }


    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.playSong("Twinkle Twinkle in French", lyrics);
    }
    
    @Override
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.playSong("Twinkle Twinkle ", lyrics);
        System.out.println("Switched to English!");
    }

    @Override
    public void pressFrenchButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.setState(box.getFrenchState());
        System.out.println("Already in French!");
    }


    public void pressSpanishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-spanish.txt");
        box.playSong(HAPPY_FILE_NAME, lyrics);
        System.out.println("Switched to Spanish!");
    }


}
