package PasswordProj;

import java.util.Random;


public class RandomCasing extends PasswordDecorator{
    
    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
    }

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
