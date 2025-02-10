package StateProj;
import java.util.ArrayList;

public class SpanishState extends State{
    
    MusicBox box;

    public SpanishState(MusicBox box){
        super(box, "C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/twinkle-spanish.txt", "C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/happy-spanish.txt");
    }
    
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.playSong("Twinkle Twinkle Spanish", lyrics);
        System.out.println("Switched to English!");
    }

    public void pressFrenchButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.playSong("Twinkle Twinkle French", lyrics);
        System.out.println("Switched to French!");
    }


    public void pressSpanishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-spanish.txt");
        box.playSong("Twinkle Twinkle Spanish", lyrics);
        System.out.println("Already in Spanish!");
    }
}
