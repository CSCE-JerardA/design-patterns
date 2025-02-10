package StateProj;
import java.util.ArrayList;

public class FrenchState extends State{

    
    
    public FrenchState(MusicBox box){
        super(box, "twinkle-french.txt", "happy-french.txt");
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
        box.playSong("happy-french.txt", lyrics);
        System.out.println("Switched to Spanish!");
    }


}
