package Boiler;

/*
 * @author Jerard Austin
 */

import java.util.Iterator;
import java.util.Scanner;


/*
 * Creates math driver class
 */
public class MathDriver {
    private Scanner reader;
    

    /*
     * Creates method for math driver class and make a scanner
     */
    public MathDriver() {
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    /*
     * Creates a method that runs the program which asks questions to a user and displays the result of them
     */
    public void run() {
        askQuestions(); 
        displayResults();
    }

    /*
     * Generates the questions for the user to answer which takes from the getInstance and getIterator methods from the MathGame class
     */
    private void askQuestions(){
        MathGame game = MathGame.getInstance();
        Iterator<Question> questions = game.getIterator();
        
        while(questions.hasNext()){
            Question question = questions.next();
            System.out.print(question.getQuestion());
            question.setUserAnwer(getInt(""));
        }
    }

    /*
     * Generates the results from the user's input which takes from the getInstance and getIterator methods from the MathGame class
     */
    private void displayResults(){
        MathGame game = MathGame.getInstance();
        System.out.println("\nResults:");
        Iterator<Question> questions = game.getIterator();
        int total = 0; 

        while(questions.hasNext()){
            Question question = questions.next();
            System.out.println(question);
            if(question.isCorrect()){
                total++;
            }
        }
        System.out.println("\nTotal: " + total + "/" + game.getNumQuestions());
    }

    private int getInt(String prompt){
        while(true){
            System.out.print(prompt);
            try {
                return Integer.parseInt(reader.nextLine().trim());
            }
            catch(Exception e){
                System.out.println("Invalid data");
            }
        }
        
    }

    public static void main(String[] args){
        MathDriver driver = new MathDriver();
        driver.run();
    }
}