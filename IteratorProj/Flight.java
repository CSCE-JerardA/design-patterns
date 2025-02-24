package IteratorProj;

/*
 * @author Jerard 
 */

/*
 * The Flight class represents a flight between two airports
 */
import java.time.LocalTime;

public class Flight {
    
    
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /*
     * a Flight object with all required details
     * @param flightNum The flight number.
     * @param from The departure airport.
     * @param to The arrival airport.
     * @param startTime The departure time.
     * @param endTime The arrival time.
     * @param numTransfers The number of transfers during the flight.
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /*
     * Gets the from time of the flight 
     * @return The departure airport
     */
    public Airport getFrom(){
        return from;
    }

    /*
     * Gets the to time of the flight 
     * @return The arrival airport.
     */
    public Airport getTo(){
        return to;
    }

    /*
     * Checks if the flight matches a specific origin and destination.
     * 
     * @param from The departure airport to check.
     * @param to The arrival airport to check.
     */
    public boolean sameLoc(Airport from, Airport to){
        return this.from == from && this.to == to;
    }

    /*
     * Returns a string representation of the flight details.
     */
    public String toString(){
        return "Flight " + flightNum + " from " + from + " to " + to + " (" + startTime + " - " + endTime + ")";
    }

}
