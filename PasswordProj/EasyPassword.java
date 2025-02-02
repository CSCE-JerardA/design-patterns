package PasswordProj;

import java.util.Random;
public class EasyPassword extends Password{
    
    public EasyPassword(String phrase){
         Random rand = new Random();
        this.password = phrase.replace(" ", "-") + rand.nextInt(101);
    }

    @Override
    public String getPassword(){
        return password;
    }
}
