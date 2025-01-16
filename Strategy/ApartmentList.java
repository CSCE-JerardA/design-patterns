package Strategy;

/*
 * Written by Jerard Austin
 */

 import java.util.ArrayList;

public class ApartmentList {
    private ArrayList<Apartment> apartments;
    private SortBehavior sortBehavior;

    //Creates a new array
    public ApartmentList(){
        this.apartments = new ArrayList<>();
    }

    //Method that allows you to add an address, number of bathrooms, number of bedrooms, and the price
    public void add(String address, int numBathrooms, int numBedrooms, double price){
        apartments.add(new Apartment(address, numBathrooms, numBedrooms, price));
    }


    

       

    



    public void setSortBehavior(){

        return SortBehavior.sort(new ArrayList<>());
    }

    


    public 





}
