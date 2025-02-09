package SongFolder;
import java.util.ArrayList;

public class EnglishState extends State{

    

    public EnglishState(MusicBox box){
        super(box, "twinkle-english.txt", "happy-english.txt");
    }

    public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("happy-english.txt");
        box.playSong("Happy", lyrics);
    }


    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.playSong("Twinkle Twinkle", lyrics);
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
