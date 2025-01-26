package ObserverProj;

/*
 *  @author Jerard Austin
 */

import java.util.ArrayList;

public class PercentageDisplay implements Observer{

    private ArrayList<Candidate> candidates;
    private Subject poll;

    public PercentageDisplay(Subject poll){
        this.poll = poll;
        this.candidates = new ArrayList<>();
        poll.registerObserver(this);

    }

    
    public void update(ArrayList<Candidate> candidates) {

        this.candidates = candidates;
        display();

    }

    public void display() {
        
        int totalVotes = 0;
        System.out.println("Percentage Display:");
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumFirstPlaceVotes() + candidate.getNumSecondPlaceVotes() + candidate.getNumThirdPlaceVotes();
        }
    }

    
}
