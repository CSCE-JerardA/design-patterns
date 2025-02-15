package Boiler;

/*
 * @Author Jerard Austin
 */

public class Question {

    private String ANSI_RED;
    private String ANSI_GREEN;
    private String ANSI_BLACK;
    
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;
    
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

    public String getQuestion(){
        return num1 + " " + operand.label + " " + num2 + " = ?";
    }

    public void setUserAnwer(int answer){
        this.userAnswer = answer;
    }

    public boolean isCorrect(){
         return userAnswer == answer;
    }

    public String toString(){
        return getQuestion() + " Your answer: " + userAnswer + (isCorrect() ? ANSI_GREEN + " (Correct)" : ANSI_RED + " (Wrong, correct answer: " + answer + ")") + ANSI_BLACK;
    }

}
