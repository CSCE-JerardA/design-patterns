package ObserverProj;

/*
 * @author Jerard Austin
 */


public interface Subject{
    
    void registerObserver(Observer observer);

   
    void removeObserver(Observer observer);

    void notifyObservers();




}
