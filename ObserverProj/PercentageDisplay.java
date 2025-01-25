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
        if (candidates == null) {
            this.candidates = new ArrayList<>(); // Prevent null references
        } else {
            this.candidates = new ArrayList<>(candidates); // Defensive copying
        }
        display();
    }

    public void display() {
        System.out.println("Percentage Display:");
        int totalVotes = candidates.stream().mapToInt(Candidate::getWeightedVotes).sum();
        for (Candidate candidate : candidates) {
            double percentage = (totalVotes > 0) ? (candidate.getWeightedVotes() * 100.0 / totalVotes) : 0;
            System.out.printf("%s - %.2f%%\n", candidate.getFullname(), percentage);
        }
    }

    
}
