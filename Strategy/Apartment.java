package Strategy;

/*
 * Written by Jerard Austin
 */

import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.ArrayList;

public class Apartment implements Comparable<Apartment> {
    String address;
    int numBedrooms;
    int numBathrooms;
    double price;


    public Apartment(String address, int numBathrooms, int numBedrooms, double price){
        
        this.address = address;
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;
        this.price = price;
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

    private String getMultiple(int number){
        if(number <= 1){
            return "";
        }

        else{
            return "s";
        }
    }
  

    private String getAddress(){
        return address;
    }

    private int getNumBedrooms(){
        return numBedrooms;
    }

    private int getNumBathrooms(){
        return numBathrooms;
    }

    private double getPrice(){
        return price;
    }


}


