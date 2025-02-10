package SongFolder;
import java.util.ArrayList;

public class SpanishState extends State{
    
    

    public SpanishState(MusicBox box){
        super(box, "twinkle-spanish.txt", "");
    }
    
     public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("happy-spanish.txt");
        box.playSong("Happy in Spanish", lyrics);
    }


    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-spanish.txt");
        box.setState(box.getSpanishState());
        System.out.println("Switched to Twinkle Twinkle Spanish!");
    }
    
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.setState(box.getEnglishState());
        System.out.println("Switched to English!");
    }

    public void pressFrenchButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.setState(box.getFrenchState());
        System.out.println("Switched to French!");
    }


    public void pressSpanishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-spanish.txt");
        box.setState(box.getSpanishState());
        System.out.println("Already in Spanish!");
    }
}
