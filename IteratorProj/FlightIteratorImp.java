package IteratorProj;

import java.util.ArrayList;

  


public class FlightIteratorImp implements FlightIterator<Flight>{

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

        return true;
    }

    public Flight next(){
        
    }



    


}
