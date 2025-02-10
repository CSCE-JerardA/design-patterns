
/*
 * @Author Jerard Austin
 */

import java.util.ArrayList;
;

/*
 * Creates the class state for the other classes to operate from
 */
public abstract  class State {
    
    /*
     * Variables from the "twinkle" and "happy"
     */
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;

    MusicBox box;

    /*
     * Creates a method for State class
     */
    public State(MusicBox box, String twinkleFileName, String happyFileName){
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);
    }

    /*
     * Creates method displaying the name of the song file along with the lyrics within it
     */
    public void pressStarButton(){
        box.playSong("Twinkle Twinkle", starLyrics);
        System.out.println("Playing Twinkle");

    }

    /*
     * Creates method displaying the name of the song file along with the lyrics within it
     */
    public void pressHappyButton(){
        box.playSong("If you're happy and you know it", happyLyrics);
        System.out.println("Playing Happy");
    }

    public abstract void pressEnglishButton();

    public abstract void pressFrenchButton();

    public abstract void pressSpanishButton();



}
