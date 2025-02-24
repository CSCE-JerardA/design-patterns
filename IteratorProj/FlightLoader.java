package IteratorProj;

/*
 * @author Jerard
 */

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;

/*
 * The FlightLoader class is responsible for loading flights from a text file.
 * It reads flight details from the file and creates Flight objects.
 */
public class FlightLoader {
    
    /*
     * Creates getFlights constructor
     * @return An ArrayList of Flight objects loaded from the file 
     */
    public ArrayList<Flight> getFlights(){
        ArrayList<Flight> flights = new ArrayList<>();
        /*
         * Ensure this file exists in the project directory
         */
        String fileName = "flights.txt";  

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); 

                if (data.length != 6) {
                    System.out.println("Skipping invalid line: " + line);
                    continue; // Skip incorrect format
                }

                try {
                    String flightNum = data[0].trim();
                    Airport from = Airport.valueOf(data[1].trim().toUpperCase()); // Convert to Airport enum
                    Airport to = Airport.valueOf(data[2].trim().toUpperCase());
                    LocalTime startTime = LocalTime.parse(data[3].trim()); // Parse HH:mm format
                    LocalTime endTime = LocalTime.parse(data[4].trim());
                    int numTransfers = Integer.parseInt(data[5].trim());

                    flights.add(new Flight(flightNum, from, to, startTime, endTime, numTransfers));
                } catch (IllegalArgumentException e) {
                    System.out.println("Skipping invalid airport or time format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading flight file: " + e.getMessage());
        }

        return flights;
    }
}

