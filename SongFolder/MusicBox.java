package SongFolder;

/*
 * @author Jerard Austin
 */
import java.util.ArrayList;

public class MusicBox {

    /*
     * Variables making the different languaged states private
     */
    private State state;
    private State englishState;
    private State frenchState;
    private State spanishState; 


    public MusicBox(){
        this.englishState = englishState;
        this.frenchState = frenchState;
        this.spanishState = spanishState;

        this.state = englishState;
    }


    public void pressStarButton(){
        state.pressStarButton();
    }

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
        this.state = state;
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
