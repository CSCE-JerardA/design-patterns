package PasswordProj;

/*
 * @author Jerard Austin
 */

/**
 * A decorator that transforms a password into a palindrome by appending its reverse.
 */
public class Pallendrome extends PasswordDecorator{

    /**
     * Constructor that initializes the pallendrome decorator.
     * @param passwordBeginning The original password.
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password as a pallendrome (original + reversed).
     * @return The transformed palindrome password.
     */
    @Override
    public String getPassword() {
        String original =passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
    
}
