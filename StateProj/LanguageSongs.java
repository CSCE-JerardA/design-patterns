

/*
 * @author Jerard Austin
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * Creates language class for the states to be ran
 */
public class LanguageSongs {
    private Scanner reader;

    /*
     * Creates a new reader in order to determine which state is being called
     */
    public LanguageSongs() {
        reader = new Scanner(System.in); 
        clear();

        
    }

    /*
     * Method that allows the user to run the code
     */
    public void run() {
        MusicBox box = new MusicBox();
        
        while(true){
            
            System.out.print("Enter (E)nglish, (F)rench, (S)panish, (T)winkle, (H)appy, Or (Q)uit: ");
            String command = reader.nextLine().trim().toLowerCase();

            if(command.equals("q")) break;

            if(command.equals("e")){
                box.pressEnglishButton();
                
            } else if(command.equals("f")){
                box.pressFrenchButton();
                
            } else if(command.equals("s")){
                box.pressSpanishButton();
                
            } else if(command.equals("t")){
                box.pressStarButton();
                
            } else if(command.equals("h")){
                box.pressHappyButton();
            } else {
                System.out.println("Invalid command");
            }
        }

        System.out.println("Goodbye");
    }

    /*
     * Method that allows user to clear the code
     */
    public static void clear() {
        System.out.print("\033[H\033[2J");
            System.out.flush();
    }

    /*
     * Method that displays the time out error to user for taking long
     */
    public static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    public static void main(String[] args) {
        LanguageSongs driver = new LanguageSongs();
        driver.run();
    }
}
