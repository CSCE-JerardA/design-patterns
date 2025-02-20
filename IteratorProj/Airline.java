package IteratorProj;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * @author Jerard Austin
 */

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    public Airline(String title){
        this.title = title;
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public String getTitle(){
        return title;
    }

    public FlightIteratorImp createIterator(ArrayList<Flight> flights, String fromCode, String toCode){
        return new FlightIteratorImp(flights, fromCode, toCode);
    }

}
