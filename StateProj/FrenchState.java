

/*
 * @author Jerard Austin
 */

/*
 * Creates french state class while being extended by the state class
 */
public class FrenchState extends State{

    /*
     * Variables
     */
    private static final String twinkle_file = "songs/twinkle-french.txt";
    private static final String happy_file = "songs/happy-french.txt";
    
    /*
     * Creates method where the french state is using the variables initialized within the state class
     */
    public FrenchState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    /*
     * Method that allows user to switch to the english language state
     */
    @Override
    public void pressEnglishButton(){
        System.out.println("Switched to English!");
        box.setState(box.getEnglishState());
        
    }

    /*
     * Method that tells the user it's already in french 
     */
    @Override
    public void pressFrenchButton(){
        System.out.println("Already in French!");
    }

    /*
     * Method that allows the user to switch to the spanish state
     */
    @Override
    public void pressSpanishButton(){
        System.out.println("Switched to Spanish!");
        box.setState(box.getSpanishState());
       
    }


}
