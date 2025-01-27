package ObserverProj;

/*
 * @author Jerard Austin
 */


/*
 * Subject interface for managing observers
 */

public interface Subject{
    
    /*
     * Registers an observer
     */
    public void registerObserver(Observer observer);

   /*
    * Removes the observer
    */
    public void removeObserver(Observer observer);

    /*
     * Notifies the observer
     */
    public void notifyObservers();




}
