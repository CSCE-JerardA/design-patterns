package StateProj;

public class SpanishState extends State{
    
    

    MusicBox box;

    private static final String twinkle_file = "twilight-french.txt";
    private static final String happy_file = "happy-french.txt";
    
    public SpanishState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    
    @Override
    public void pressEnglishButton(){
        System.out.println("Switched to English!");
        box.setState(box.getEnglishState());
        
        
    }

    @Override
    public void pressFrenchButton(){
        System.out.println("Switched to French!");
        box.setState(box.getFrenchState());
    }


    public void pressSpanishButton(){
        System.out.println("Already in Spanish!");
        
       
    }
}
