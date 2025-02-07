package SongFolder;
import java.io.FileReader;
import java.util.ArrayList;

public class EnglishState extends State{

    public EnglishState(MusicBox box){
        super(box);
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
