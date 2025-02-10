package StateProj;

public class FrenchState extends State{

    private static final String twinkle_file = "twinkle-french.txt";
    private static final String happy_file = "happy-french.txt";
    
    public FrenchState(MusicBox box){
        super(box, twinkle_file, happy_file);
    }
    
    
    @Override
    public void pressEnglishButton(){
        System.out.println("Switched to English!");
        box.setState(box.getEnglishState());
        
    }

    @Override
    public void pressFrenchButton(){
        System.out.println("Already in French!");
    }


    @Override
    public void pressSpanishButton(){
        System.out.println("Switched to Spanish!");
        box.setState(box.getSpanishState());
       
    }


}
