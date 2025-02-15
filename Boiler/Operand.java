package Boiler;

/*
 * @author Jerard Austin
 */


 /*
  * Enumerator class that determines what type of math problem is displayed
  */
public enum Operand {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*");


    public final String label;


    /*
     * Class that labels the string
     */
    private Operand(String label){
        this.label = label;
    }
}
