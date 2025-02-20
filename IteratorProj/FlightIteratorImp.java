package IteratorProj;

import java.util.ArrayList;
  

public class FlightIteratorImp implements FlightIterator{

    private ArrayList<Flight> flights;

    private int position = 0;
    private Airport from;
    private Airport to;

    public FlightIteratorImp(ArrayList<Flight> flights, Airport from, Airport to) {

        this.flights = flights;
        this.from = from;
        this.to = to;
    }

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

    public Flight next(){
        if (hasNext()) {
            return flights.get(position++);
        }
        return null;
    }
}



    



