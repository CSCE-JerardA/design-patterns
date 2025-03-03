package IteratorProj;


/*
 *
 * The AirlineDriver class serves as the main entry point for the airline system.
 * 
 * @author Jerard
 */
 

import java.util.Scanner;

public class AirlineDriver {
   
    /*
     * Constructor for the AirlineDriver class.
     */
    public AirlineDriver(){
        Airline american = new Airline("American Airlines");
        Scanner reader = new Scanner(System.in);

        /*
         * Load flights from text file
         */
        FlightLoader flightLoader = new FlightLoader();
        american.addFlights(flightLoader.getFlights());


        /*
         * Get user input for flight search
         */
        System.out.print("\nEnter Origin Airport Code: ");
        String fromCode = reader.nextLine();


        System.out.print("Enter Destination Airport Code: ");
        String toCode = reader.nextLine();

        /*
         * // Retrieve matching flights using the iterator
         */
        FlightIterator flights = american.createIterator(Airport.valueOf(fromCode.toUpperCase()), Airport.valueOf(toCode.toUpperCase()));

        System.out.println();

        

        if(!flights.hasNext()){
            System.out.println("No flights were found! ");
            return;
        }


        while(flights.hasNext()){
            System.out.println("  " + flights.next());
        }

        

    }

    

    public static void main(String[] args){
        AirlineDriver driver = new AirlineDriver();
    }
}
