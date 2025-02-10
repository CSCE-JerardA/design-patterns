package StateProj;

/*
 * @author Jerard Austin
 */

 /*
  * Creates spanish state class while being extended by the state class
  */

public class SpanishState extends State{
    
    /*
     * Vraiables from state file
     */

    MusicBox box;

    private static final String twinkle_file = "songs/twinkle-spanish.txt";
    private static final String happy_file = "songs/happy-spanish.txt";
    
    /*
     * Creates method for spanish state using the variables in state file
     */
    public SpanishState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    /*
     * Allows user to switch to english state 
     */
    @Override
    public void pressEnglishButton(){
        System.out.println("Switched to English!");
        box.setState(box.getEnglishState());
        
        
    }

    /*
     * Allows user to switch to french state  
     */
    @Override
    public void pressFrenchButton(){
        System.out.println("Switched to French!");
        box.setState(box.getFrenchState());
    }

    /*
     * Tells the user that the state is already in spanish
     */
    @Override
    public void pressSpanishButton(){
        System.out.println("Already in Spanish!");
        
       
    }
}
