package IteratorProj;

import java.util.ArrayList;

/*
 * @author Jerard Austin
 */

 /*
  * The Airline class represents an airline that manages a list of flights.
  */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /*
     * Airline constructor
     */
    public Airline(String title){
        this.title = title;
        this.flights = new ArrayList<>();
    }

    /*
     * Adds a list of flights to the airline
     */
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    /*
     * Gets the name of the airline
     */
    public String getTitle(){
        return title;
    }

    /*
     * Creates an iterator to retrieve flights based on the specified origin and destination
     */
    public FlightIterator createIterator(Airport fromCode, Airport toCode){
        return new FlightIteratorImp(flights, fromCode, toCode);
    }

    /*
     * Adds a list of flights to the airline
     */
    public void addFlights(ArrayList<Flight> flights) {
        this.flights.addAll(flights);
    }


}
