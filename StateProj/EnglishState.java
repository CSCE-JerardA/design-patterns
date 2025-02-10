package StateProj;
import java.util.ArrayList;

/*
 * @author Jerard Austin
 */

public class EnglishState extends State{

    MusicBox box;

    public EnglishState(MusicBox box){
        super(box, "C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/twinkle-english.txt", "C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/happy-english.txt");
    }
    
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/twinkle-english.txt");
        box.setState(box.getEnglishState());
        System.out.println("Already in English!");
    }

    public void pressFrenchButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/twinkle-french.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Switched to French!");
    }


    public void pressSpanishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("C:/Users/jcaus/OneDrive/Documents/GitHub/CSCE247/StateProj/twinkle-spanish.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Switched to Spanish!");
    }

}
