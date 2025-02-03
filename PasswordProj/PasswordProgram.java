package PasswordProj;

import java.util.Scanner;

/*
 * @author Jerard Austin
 */

    /*
     * Constructor initializes the scanner for user input.
     */
public class PasswordProgram {
    private Scanner reader;

    public PasswordProgram() {
        this.reader = new Scanner(System.in);
    }

    /*
     * Runs the password generator program.
     */
    public void run() {
        System.out.println("Welcome to our password generator program");
        System.out.print("\nEnter a phrase: ");
        String phrase = reader.nextLine();

        Password password = new EasyPassword(phrase);

        System.out.println("\nEasy Password: " + password.getPassword());

       /*
        * Apply transformations step by step
        */
        password = new Pallendrome(password);
        System.out.println("\nPallendrome Password: " + password.getPassword());

        password = new Symbols(password);
        System.out.println("\nReplacing Symbols: " + password.getPassword());

        password = new RandomCasing(password);
        System.out.println("\nRandom Casing: " + password.getPassword());

        password = new SpecialChars(password);
        System.out.println("\nAdding Special Characters: " + password.getPassword());
    }

    /*
     * Main method to start the program.
     */
    public static void main(String[] args){
        PasswordProgram program = new PasswordProgram();
        program.run();
    }
}
