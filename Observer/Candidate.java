package Observer;

/*
 * @author Jerard Austin
 */

import java.util.Scanner;
import javax.swing.JOptionPane;


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


        return;

    }


    public void addVote(){

    }

    public void addFirstVote(){


    }

    public void addSecondVote(){


    }


    public void addThirdVote(){


    }


    public double getWeightedVotes(){
        return 

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
