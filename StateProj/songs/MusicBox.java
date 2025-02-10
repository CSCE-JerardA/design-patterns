package SongFolder;

/*
 * @author Jerard Austin
 */
import java.util.ArrayList;

public class MusicBox {

    MusicBox box;
    /*
     * Variables making the different languaged states private
     */
    private State state;
    private State englishState;
    private State frenchState;
    private State spanishState; 


    public MusicBox(){
        this.englishState = new EnglishState(this);
        this.frenchState = new FrenchState(this);
        this.spanishState = new SpanishState(this);

        this.state = englishState;
    }

    /*
     * Allows user to switch to Twinkle Twinkle song
     */
    public void pressStarButton(){
        state.pressStarButton();
    }
    /*
     * Allows user to switch to if you're happy and you know it song
     */
    public void pressHappyButton(){
        state.pressHappyButton();
    }


    public void pressEnglishButton(){
        setState(englishState);
    }

    public void pressFrenchButton(){
        setState(frenchState);
    }


    public void pressSpanishButton(){
        setState(spanishState);
    }

    public void setState(State state){
        if (state != null) {
        this.state = state;
    } else {
        System.out.println("Error: Attempted to set null state!");
    }
    }

    public State getEnglishState(){
        return englishState;
    }

    public State getFrenchState(){
        return frenchState;
    }

    public State getSpanishState(){
        return spanishState;
    }

    public void playSong(String songName, ArrayList<String> lyrics){
        System.out.println("Play song: " + songName);
        for(String lines : lyrics){
            System.out.println(lines);
        }
    }

}
