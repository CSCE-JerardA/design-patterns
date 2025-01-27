package ObserverProj;

/*
 *  @author Jerard Austin
 */

import java.util.ArrayList;


/*
 * Class representing the StudentGovtPoll that implements the interface Subject
 */
public class StudentGovtPoll implements Subject{

    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;

    String school;

    public StudentGovtPoll(String school){
        this.school = school;
        this.observers = new ArrayList<>();
        this.candidates = new ArrayList<>();

    }

    @Override

    /*
     * Method that adds the observer to the registerObserver 
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override

    /*
     * Method that removes the observer to the removeObserver 
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(candidates);
        }

    }

    /*
     * Method that adds a candidates name
     */
    public void addCandidate(String firstName, String lastName ){
        candidates.add(new Candidate(firstName, lastName));

    }

    /*
     * Method that enter the first, second and third place votes
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace){
        if (firstPlace >= 0 && firstPlace < candidates.size()) {
            candidates.get(firstPlace).addFirstVote();
        }
        if (secondPlace >= 0 && secondPlace < candidates.size()) {
            candidates.get(secondPlace).addSecondVote();
        }
        if (thirdPlace >= 0 && thirdPlace < candidates.size()) {
            candidates.get(thirdPlace).addThirdVote();
        }
        notifyObservers();
    }

    public String getSchool(String school){
        return school;
    }





}