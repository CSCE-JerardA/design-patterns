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
        System.out.println("\nCurrent Tallies:");
        for (Candidate candidate : candidates) {
            System.out.printf("%s: First(%d), Second(%d), Third(%d)\n",
                candidate.getFullname(),
                candidate.getNumFirstPlaceVotes(),
                candidate.getNumSecondPlaceVotes(),
                candidate.getNumThirdPlaceVotes());
        }
    }
}




    



