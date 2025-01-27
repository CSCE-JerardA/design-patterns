package ObserverProj;

/*
 * @author Jerard Austin
 */


 /*
  * Class representing a candidate
  */
public class Candidate {

    /*
     * Variables including the total amount of votes, first and last name of the candidate along with their 1st, 2nd and 3rd place votes. 
     */
    int totalNumVotes;
    String firstName;
    String lastName;
    int numFirstPlaceVotes;
    int numSecondPlaceVotes;
    int numThirdPlaceVotes;

    /*
     * Candidate method 
     */
    public Candidate(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
        this.numFirstPlaceVotes = 0;
        this.numSecondPlaceVotes = 0;
        this.numThirdPlaceVotes = 0;

    }



    public boolean equals(String firstName, String lastName){


        return this.firstName.equalsIgnoreCase(firstName) && this.lastName.equalsIgnoreCase(lastName);

    }


    public void addVote(){
        totalNumVotes++;
    }

    public void addFirstVote(){
        numFirstPlaceVotes++;
        addVote();
    }

    public void addSecondVote(){
        numSecondPlaceVotes++;
        addVote();

    }


    public void addThirdVote(){
        numThirdPlaceVotes++;
        addVote();

    }

    /*
     * Calculates the total amount of weighted votes
     */
    public int getWeightedVotes(){

        return numFirstPlaceVotes * 3 + numSecondPlaceVotes * 2 + numThirdPlaceVotes;

    }

    public String getFullname(){

        return firstName + " " + lastName;
    } 


    public int getNumFirstPlaceVotes(){

        return numFirstPlaceVotes;
    }

    public int getNumSecondPlaceVotes(){

        return numSecondPlaceVotes;
    }

    public int getNumThirdPlaceVotes(){

        return numThirdPlaceVotes;
    }





}
