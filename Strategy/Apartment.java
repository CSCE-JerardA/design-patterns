package Strategy;

/*
 * Written by Jerard Austin
 */

import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Apartment {
    String address;
    int numBedrooms;
    int numBathrooms;
    double price;


    public Apartment(String address, int numBathrooms, int numBedrooms, double price){
        
        this.address = address;
        this.numBathrooms = 0;
        this.numBedrooms = 0;
        this.price = 0.0;
    }

    public String getAddress(){
        return address;
    }

    public int getNumBedrooms(){
        return numBedrooms;
    }

    public int getNumBathrooms(){
        return numBathrooms;
    }

    public double getPrice(){
        return price;
    }


}


