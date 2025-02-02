package PasswordProj;

import java.util.Random;

public class SpecialChars extends PasswordDecorator{
    private static final char[] SPECIAL_CHARS = {'*', '!', '%', '+', '.', '{', '}'};
    private static final Random random = new Random();

    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

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
