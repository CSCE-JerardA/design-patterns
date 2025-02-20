package IteratorProj;

import java.util.ArrayList;
import java.util.Iterator;
  


public class FlightIterator implements FlightIterator<Flight>{

    private ArrayList<Flight> flights;

    private int position = 0;
    private Airport from;
    private Airport to;

    public FlightIteratorImp(ArrayList<Flight> flights, Airport from, Airport to) {

        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    public bool hasNext(){

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



    


}
