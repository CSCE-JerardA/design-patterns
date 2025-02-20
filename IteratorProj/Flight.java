package IteratorProj;

import java.time.LocalTime;

public class Flight {
    
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    public Airport getFrom(){
        return from;
    }

    public Airport getTo(){
        return to;
    }

    public boolean sameLoc(Airport from, Airport to){
        return this.from == from && this.to == to;
    }

    public String toString(){
        return "Flight " + flightNum + " from " + from + " to " + to + " (" + startTime + " - " + endTime + ")";
    }

}
