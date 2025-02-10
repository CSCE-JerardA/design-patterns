package StateProj;

/*
 * @author Jerard Austin
 */

/*
 * Creates the english state class while being extended by the state class
 */
public class EnglishState extends State{

    /*
     * Variables initialized back in state file
     */
    MusicBox box;

    private static final String twinkle_file = "songs/twinkle-english.txt";
    private static final String happy_file = "songs/happy-english.txt";
    
    /*
     * Creates the english state method while using the variables from state file
     */
    public EnglishState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    /*
     * Method that tells the user that the state is already in english
     */
    @Override
    public void pressEnglishButton(){
        System.out.println("Already in French!");
        
        
    }

    /*
     * Method that allows the user to switch to french state
     */
    @Override
    public void pressFrenchButton(){
        System.out.println("Switched to French!");
        box.setState(box.getFrenchState());
    }

    /*
     * Method that allows the user to switch to spanish state
     */
    @Override
    public void pressSpanishButton(){
        System.out.println("Switched to Spanish!");
        box.setState(box.getSpanishState());
       
    }

}
