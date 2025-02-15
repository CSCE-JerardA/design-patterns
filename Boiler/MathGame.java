package Boiler;

/*
 * @author Jerard Austin
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


/*
 * Class that initializes the number of questions, the list of random questions, and the math game
 */
public class MathGame {
    
    private static final int NUM_QUESTIONS = 5;

    private static MathGame mathGame;

    private ArrayList<Question> questions;

    /*
     * Creates a class that creates a list of questions from the generateQuestions method
     */
    private MathGame(){
        questions = new ArrayList<>();
        generateQuestions();
    }

    /*
     * Creates math problems from randomly generated numbers
     */
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

    /*
     * Creates a new math game if the math game variable is empty and returns it
     */
    public static MathGame getInstance(){
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /*
     * Returns the list of questions
     */
    public Iterator<Question> getIterator(){
        return questions.iterator();
    }

    /*
     * Returns the number of questions
     */
    public int getNumQuestions() {
        return NUM_QUESTIONS;
    }


}
