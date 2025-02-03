package PasswordProj;

/*
 * @author Jerard Austin
 */

/**
 * A decorator that adds symbols to the password.
 */
public class Symbols extends PasswordDecorator{

    /**
 * Symbols replaces certain letters with special symbols.
 * - a → @, b → 8, e → 3, g → 9, i → !, o → 0, s → $, t → 7
 */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with letter replacements.
     * @return Password with symbols instead of letters
     */
    @Override
    public String getPassword() {
        
        return passwordBeginning.getPassword()
                .replace("a", "@")
                .replace("b", "8")
                .replace("e", "3")
                .replace("g", "9")
                .replace("i", "!")
                .replace("o", "0")
                .replace("s", "$")
                .replace("t", "7");
    }
}
