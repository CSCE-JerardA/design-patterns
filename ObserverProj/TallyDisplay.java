package ObserverProj;


import java.util.ArrayList;

/*
 * Class representing the Tally Display while also implementing the Observer interface
 */
public class TallyDisplay implements Observer{
    
    private ArrayList<Candidate> candidates;
    private Subject poll;


    public TallyDisplay(Subject poll){
        this.poll = poll;
        this.candidates = new ArrayList<>();
        poll.registerObserver(this);

    }

    /*
     * Method updating the candidates info
     */
     public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }


    /*
     * Method displaying the amount of tallies
     */
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




    



