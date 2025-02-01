package PasswordProj;

/*
 * @author Jerard Austin
 */

public abstract class PasswordDecorator extends Password {
    
    Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning){

    }

    public abstract String getPassword();
    

}
