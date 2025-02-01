package PasswordProj;

public class SpecialChars extends PasswordDecorator{
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        return "!" + passwordBeginning.getPassword() + "!";
    }
}
