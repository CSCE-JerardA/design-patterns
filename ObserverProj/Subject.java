package ObserverProj;

/*
 * @author Jerard Austin
 */


public interface Subject{
    
    public void registerObserver(Observer observer);

   
    public void removeObserver(Observer observer);

    public void notifyObservers();




}
