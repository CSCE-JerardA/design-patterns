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
        System.out.println("\nCurrent Percent of Votes:");
        int totalVotes = candidates.stream().mapToInt(Candidate::getWeightedVotes);
        for (Candidate candidate : candidates) {
            double percentage = (totalVotes > 0) ? (candidate.getWeightedVotes() * 100.0 / totalVotes) : 0;
            System.out.printf("%s %.2f%%\n", candidate.getFullname(), percentage);
        }
    }

    
}
