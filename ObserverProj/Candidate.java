package ObserverProj;

/*
 * @author Jerard Austin
 */


public class Candidate {

    int totalNumVotes;
    String firstName;
    String lastName;
    int numFirstPlaceVotes;
    int numSecondPlaceVotes;
    int numThirdPlaceVotes;

    public Candidate(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

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


    public double getWeightedVotes(){

        return (numFirstPlaceVotes * 3) + (numSecondPlaceVotes * 2) + numThirdPlaceVotes;

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
