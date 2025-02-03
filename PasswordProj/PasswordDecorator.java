package PasswordProj;

/*
 * @author Jerard Austin
 */

 /**
 * Abstract decorator class for Password, following the Decorator Pattern.
 */
public abstract class PasswordDecorator extends Password {
    

    /**
     * Constructs a PasswordDecorator with a given Password object.
     * @param passwordBeginning The base Password to decorate.
     */
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }

    public String getPassword(){
        return passwordBeginning.getPassword();
    }
    

}
