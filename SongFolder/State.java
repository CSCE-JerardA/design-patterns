package SongFolder;

import java.util.ArrayList;

public abstract class State {
    
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;

    protected MusicBox box;

    public State(MusicBox box, String twinkleFileName, String happyFileName){
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);
    }

    public void pressStarButton(){
        System.out.println("Playing Twinkle");
    }

    public void pressHappyButton(){
        System.out.println("Playing Happy");
    }

    public void pressEnglishButton(){
         System.out.println("Already in English.");
    }

    public void pressFrenchButton(){
         System.out.println("Swap French.");
    }

    public void pressSpanishButton(){
        System.out.println("Swap Spanish.");
    }



}
