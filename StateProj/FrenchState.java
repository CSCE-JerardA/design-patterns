package StateProj;
import java.util.ArrayList;

public class FrenchState extends State{

    private static final String twinkle_file = "songs/twilight-french.txt";
    private static final String happy_file = "songs/happy-french.txt";
    
    public FrenchState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    
    @Override
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("");
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
