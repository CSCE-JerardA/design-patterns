package PasswordProj;

import java.util.Random;

/*
 * @author Jerard Austin
 */


/*
 * A decorator that applies random casing to the password.
 */
public class RandomCasing extends PasswordDecorator{
    
    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
    }


    /*
     * Returns the password with randomly capitalized letters.
     * @return Modified password with random casing
     */
    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (char c : passwordBeginning.getPassword().toCharArray()) {
            if (random.nextBoolean()) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }



}
