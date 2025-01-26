package ObserverProj;


import java.util.ArrayList;

public class TallyDisplay implements Observer{
    
    private ArrayList<Candidate> candidates;
    private Subject poll;

    //small changes

    public TallyDisplay(Subject poll){
        this.poll = poll;
        this.candidates = new ArrayList<>();
        poll.registerObserver(this);

    }

     public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }


    public void display() {
        System.out.println("Tally Display:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getFullname() + " - Weighted Votes: " + candidate.getWeightedVotes());
        }
    }


}

    



