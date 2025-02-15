package Boiler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class MathGame {
    
    private static final int NUM_QUESTIONS = 5;

    private MathGame mathGame;

    private ArrayList<Question> questions;

    private MathGame(){
        questions = new ArrayList<>();
        generateQuestions();
    }

    private void generateQuestions() {
        Random rand = new Random();
        Operand[] operands = Operand.values();

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            Operand operand = operands[rand.nextInt(operands.length)];
            questions.add(new Question(num1, num2, operand));
        }
    }

    public MathGame getInstance(){
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    public Iterator<Question> getIterator(){
        return questions.iterator();
    }

    public int getNumQuestions() {
        return NUM_QUESTIONS;
    }


}
