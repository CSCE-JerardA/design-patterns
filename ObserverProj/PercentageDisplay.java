package ObserverProj;

/*
 *  @author Jerard Austin
 */

import java.util.ArrayList;

public class PercentageDisplay {

    private ArrayList<Candidate> candidates;
    private Subject poll;

    public PercentageDisplay(Subject poll){

    }

    public void display(){

    }

    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();

    
}
