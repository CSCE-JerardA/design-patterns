package PasswordProj;

public class Pallendrome extends PasswordDecorator{

    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
    
}
