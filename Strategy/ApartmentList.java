package Strategy;

/*
 * Written by Jerard Austin
 */

 import java.util.ArrayList;

public class ApartmentList {
    private ArrayList<Apartment> apartments;
    private SortBehavior sortBehavior;

    public ApartmentList(){
        this.apartments = new ArrayList<>();
    }

    public void add(String address, int numBathrooms, int numBedrooms, double price){
        apartments.add(new Apartment(address, numBathrooms, numBedrooms, price));
    }

    public void setSortBehavior(){

        return sortBehavior.sort(new ArrayList<>());
    }

    

}
