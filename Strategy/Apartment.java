package Strategy;

/*
 * Written by Jerard Austin
 */

import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Apartment implements Comparable<Apartment> {
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

    
        @Override
    public int compareTo(Apartment apartment) {
        if(this.price < apartment.price){
            return 1;
        } else if(this.price > apartment.price){
            return -1;
        }
        return 0;
    }


    public String toString(){
        return "$" +  String.format( "%.2f", price )  + " " + address + "\n" + 
        numBedrooms + " bedroom" + getMultiple(numBedrooms) + " " + 
        numBathrooms + " bathroom" + getMultiple(numBathrooms) + " \n";
    }

    public String getMultiple(int number){
        if(number <= 1){
            return "";
        }

        else{
            return "s";
        }
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


