package Observer;

/*
 * @author Jerard Austin
 */


public interface Subject{
    
    /**
     * @param observer
     */
    public void registerObserver(Observer observer){

    }

    /**
     * @param observer
     */
    public void removeObserver(Observer observer){

    }

    public void notifyObservers(){

    }




}
