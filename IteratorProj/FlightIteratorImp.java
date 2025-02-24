package IteratorProj;

/*
 * @author Jerard
 */

import java.util.ArrayList;
  

/*
 * The FlightIterator class provides an iterator for filtering flights based on origin and destination.
 * It implements the built-in Java Iterator interface.
 */
public class FlightIteratorImp implements FlightIterator{

    
    private ArrayList<Flight> flights;

    private int position = 0;
    private Airport from;
    private Airport to;

    /*
     * Constructor for FlightIteratorImp
     *  @param flights The list of flights to filter.
     * @param from The departure airport.
     * @param to The arrival airport.
     */
    public FlightIteratorImp(ArrayList<Flight> flights, Airport from, Airport to) {

        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    /*
     * @Override
     */
    public boolean hasNext(){

        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    
    }

    /*
     * @Override
     */
    public Flight next(){
        if (hasNext()) {
            return flights.get(position++);
        }
        return null;
    }
}



    



