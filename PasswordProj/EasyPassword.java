package PasswordProj;

public class EasyPassword extends Password{
    
    public EasyPassword(String phrase){
        this.password = phrase;
    }

    @Override
    public String getPassword(){
        return password;
    }
}
