package PasswordProj;

/*
 * @author Jerard Austin
 */

public abstract class PasswordDecorator extends Password {
    
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }

    public String getPassword(){
        return passwordBeginning.getPassword();
    }
    

}
