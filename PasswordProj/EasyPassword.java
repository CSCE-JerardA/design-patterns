package PasswordProj;

/*
 * @author Jerard Austin
 */


    /**
    * A simple password class that initializes with a phrase.
    */
import java.util.Random;
public class EasyPassword extends Password{
    
    /**
     * Constructs an EasyPassword object with the given phrase.
     * @param phrase The initial password phrase.
     */
    
    public EasyPassword(String phrase){
         Random rand = new Random();
        this.password = phrase.replace(" ", "-") + rand.nextInt(101);
    }

    @Override
    public String getPassword(){
        return password;
    }
}
