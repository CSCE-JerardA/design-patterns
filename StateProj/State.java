package StateProj.songs;

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
        box.playSong("Twinkle Twinkle", starLyrics);
        System.out.println("Playing Twinkle");

    }

    public void pressHappyButton(){
        box.playSong("If you're happy and you know it", happyLyrics);
        System.out.println("Playing Happy");
    }

    public abstract void pressEnglishButton();

    public abstract void pressFrenchButton();

    public abstract void pressSpanishButton();



}
