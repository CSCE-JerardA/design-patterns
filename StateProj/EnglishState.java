package StateProj;

/*
 * @author Jerard Austin
 */

public class EnglishState extends State{

    protected MusicBox box;

    private static final String twinkle_file = "twilight-english.txt";
    private static final String happy_file = "happy-english.txt";
    
    public EnglishState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    
    @Override
    public void pressEnglishButton(){
        System.out.println("Already in French!");
        
        
    }

    @Override
    public void pressFrenchButton(){
        System.out.println("Switched to French!");
        box.setState(box.getFrenchState());
    }


    public void pressSpanishButton(){
        System.out.println("Switched to Spanish!");
        box.setState(box.getSpanishState());
       
    }

}
