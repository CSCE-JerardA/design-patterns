package StateProj;
import java.util.ArrayList;
import java.io.FileReader;

/*
 * @author Jerard Austin
 */

public class EnglishState extends State{

    MusicBox box;

    public EnglishState(MusicBox box){
        super(box, "twinkle-english.txt", "happy-english.txt");
    }
    
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.setState(box.getEnglishState());
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
