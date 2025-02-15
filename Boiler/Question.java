package Boiler;

/*
 * @Author Jerard Austin
 */

 /*
  * Creates question class while listing the variables of the questions being asked
  */
public class Question {

    private String ANSI_RED = "\u001B[32m";
    private String ANSI_GREEN = "\u001B[31m";
    private String ANSI_BLACK = "\u001B[30m";
    
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;
    
    /*
     * Creates a method initializing the variables while also making a switch case which depends on the operand
     */
    public Question(int num1, int num2, Operand operand){
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;

        switch (operand) {
            case PLUS:
                answer = num1 + num2;
                break;
            case MINUS:
                answer = num1 - num2;
                break;
            case MULTIPLY:
                answer = num1 * num2;
                break;
        }
    }

    /*
     * Creates the question and returns it
     */
    public String getQuestion(){
        return num1 + " " + operand.label + " " + num2 + " = ?";
    }

    /*
     * Establishes the answer
     */
    public void setUserAnwer(int answer){
        this.userAnswer = answer;
    }

    /*
     * Determines if the answer is correct or not
     */
    public boolean isCorrect(){
         return userAnswer == answer;
    }

    /*
     * Determines whether the answer is correct or not then displays it
     */
    public String toString(){
        String result = getQuestion() + " Your answer: " + userAnswer;
        if (isCorrect()) {
            result += ANSI_GREEN + " Correct!! ";
        } else {
            result += ANSI_RED + " Wrong, correct answer: " + answer + "";
        }
        result += ANSI_BLACK;
        return result;
    
        }

}
