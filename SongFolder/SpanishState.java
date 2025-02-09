package SongFolder;
import java.util.ArrayList;

public class SpanishState extends State{
    
    private static final String TWINKLE_FILE_NAME = "twinkle-spanish.txt";
    private static final String HAPPY_FILE_NAME = "happy-spanish.txt";

    public SpanishState(MusicBox box){
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }
    
     public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("happy-spanish.txt");
        box.playSong("Happy", lyrics);
    }


    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-spanish.txt");
        box.playSong("Twinkle Twinkle", lyrics);
    }
    
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Already in English!");
    }

    public void pressFrenchButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Switched to French!");
    }


    public void pressSpanishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Switched to Spanish!");
    }
}
