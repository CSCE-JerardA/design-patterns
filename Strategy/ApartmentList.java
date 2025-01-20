package Strategy;

/*
 * Written by Jerard Austin
 */

 import java.util.ArrayList;

public class ApartmentList {
    private ArrayList<Apartment> apartment;
    private SortBehavior sortBehavior;

    //Creates a new array
    public ApartmentList(){
        this.apartment = new ArrayList<>();
    }

    //Method that allows you to add an address, number of bathrooms, number of bedrooms, and the price
    public void add(String address, int numBathrooms, int numBedrooms, double price){
        apartment.add(new Apartment(address, numBathrooms, numBedrooms, price));
    }


    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<Apartment> getSortedList() {
        return sortBehavior.sort(apartment);
    }

    public ArrayList<Apartment> getUnSortedList() {
        return apartment;
    }


}
