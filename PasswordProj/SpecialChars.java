package PasswordProj;

import java.util.Random;

/*
 * @author Jerard Austin
 */

/*
 * A decorator that adds special characters to the password.
 */
public class SpecialChars extends PasswordDecorator{
    private static final char[] SPECIAL_CHARS = {'*', '!', '%', '+', '.', '{', '}'};
    private static final Random random = new Random();


    /*
     * Constructor that initializes with an existing password.
     * @param passwordBeginning The password to modify
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /*
     * Returns the password with random special characters inserted.
     * @return Password with inserted special characters
     */
    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();

        for (char c : passwordBeginning.getPassword().toCharArray()) {
            sb.append(c);
            if (random.nextDouble() < 0.3) {
                sb.append(SPECIAL_CHARS[random.nextInt(SPECIAL_CHARS.length)]);
            }
        }
        return sb.toString();
    }
}
