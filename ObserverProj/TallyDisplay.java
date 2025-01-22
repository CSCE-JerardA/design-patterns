package ObserverProj;


import java.util.ArrayList;

public class TallyDisplay implements Observer{
    
    private ArrayList<Candidate> candidates;
    private Subject poll;

    //small changes

    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);

    }

    public void display(){
         System.out.println("Results:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getFullname() + " : " + candidate.getNumFirstPlaceVotes() + " 1st-place votes, " + 
                candidate.getNumSecondPlaceVotes() + " 2nd-place votes, " + candidate.getNumThirdPlaceVotes() + " 3rd-place votes.");
    }

}

    


}
