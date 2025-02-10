package StateProj;



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

    /*
     * Creates MusicBox method for our variables to be initialized
     */
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

    /*
     * Allows user to choose the english language button
     */
    public void pressEnglishButton(){
        setState(englishState);
    }
    /*
     * Allows user to choose the french language button
     */
    public void pressFrenchButton(){
        setState(frenchState);
    }

    /*
     * Allows user to choose the spanish language button
     */
    public void pressSpanishButton(){
        setState(spanishState);
    }

    /*
     * Sets the state if the state isn't null, otherwise it displays that the state isn't null
     */
    public void setState(State state){
        if (state != null) {
        this.state = state;
    } else {
        System.out.println("Error: Tried to set a null state!");
    }
    }

    /*
     * Returns the english state
     */
    public State getEnglishState(){
        return englishState;
    }

    /*
     * Returns the french state
     */
    public State getFrenchState(){
        return frenchState;
    }

    /*
     * Returns the spanish state
     */
    public State getSpanishState(){
        return spanishState;
    }

    /*
     * Method that displays the name of the song while displaying the lyrics
     */
    public void playSong(String songName, ArrayList<String> lyrics){
        System.out.println("Play song: " + songName);
        for(String lines : lyrics){
            System.out.println(lines);
        }
    }

}
