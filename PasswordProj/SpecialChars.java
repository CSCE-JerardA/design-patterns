package PasswordProj;

public class SpecialChars extends PaaswordDecorator{
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        return "!" + passwordBeginning.getPassword() + "!";
    }
}
