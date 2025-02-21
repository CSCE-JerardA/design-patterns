package IteratorProj;

import java.util.Iterator;
import java.util.Scanner;

public class AirlineDriver {
   
    public AirlineDriver(){
        Airline american = new Airline("American Airlines");
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter Origin Airport Code: ");
        String fromCode = reader.nextLine();

        System.out.print("Enter Destination Airport Code: ");
        String toCode = reader.nextLine();

         

        Airport from = getAirport(fromCode);
        Airport to = getAirport(toCode);

        if (from == null || to == null) {
                System.out.println("Invalid airport code entered.");
                return;
            }

        FlightIterator flights = american.createIterator(String from, String to);
        System.out.println();

}



        if(flights == null){
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
