package PasswordProj;

public class Symbols extends PasswordDecorator{
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        return passwordBeginning.getPassword() + "@#$";
    }
}
