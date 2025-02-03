package PasswordProj;

/*
 * @author Jerard Austin
 */

public class Pallendrome extends PasswordDecorator{

    /**
     * Constructor that initializes the palindrome decorator.
     * @param passwordBeginning The original password object.
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password as a palindrome (original + reversed).
     * @return The transformed palindrome password.
     */
    @Override
    public String getPassword() {
        String original =passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
    
}
