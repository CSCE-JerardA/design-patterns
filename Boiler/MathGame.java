package Boiler;

import java.util.ArrayList;


public class MathGame {
    
    private int NUM_QUESTIONS;

    private MathGame mathGame;

    private ArrayList<Question> questions;

    public MathGame(int NUM_QUESTIONS, MathGame mathGame){
        this.mathGame = mathGame;
        this.NUM_QUESTIONS = NUM_QUESTIONS;
    }

    public MathGame getInstance(){
        
    }

    public Iterator<Question> getIterator(){
        
    }
}
