package Strategy;

import java.util.ArrayList;

/**
 * Creates lists of information, and displays the sorted versions of the lists
 */
public class ListDriver {

    /**
     * Creates a new ListDriver
     */
    public ListDriver(){}

    /**
     * Main entryway to the program
     * Creates the lists, and displays the sorted lists
     */
    public void run() {
        ApartmentList apartmentList = new ApartmentList();
        apartmentList.setSortBehavior(new BubbleSort());

        apartmentList.add("Saga", 1, 1, 1375);
        apartmentList.add("Saga", 2, 2, 799);
        apartmentList.add("Saga", 3, 3, 920);

        apartmentList.add("Pulaski Square Townhomes", 3, 3, 980);

        apartmentList.add("650 Lincoln", 3, 3, 915);
        apartmentList.add("650 Lincoln", 2, 1, 800);
        apartmentList.add("650 Lincoln", 1, 1, 1400);

        apartmentList.add("Green Street Crossing", 3, 3, 1012);
        apartmentList.add("Green Street Crossing", 2, 1, 850);
        apartmentList.add("Green Street Crossing", 1, 1, 1520);

        ArrayList<Apartment> sortedApartments = apartmentList.getSortedList();
        System.out.println("\n***** Highest Price to Lowest *****\n");
        displayList(sortedApartments);

        apartmentList.setSortBehavior(new QuickSort());
        sortedApartments = apartmentList.getSortedList();
        System.out.println("\n***** Lowest Price to Highest *****\n");
        displayList(sortedApartments);
    }

    /**
     * Loops through and displays each item in the list items
     * @param items list to display
     */
    private void displayList(ArrayList<Apartment> apartments){
        for(Apartment apartment : apartments){
            System.out.println(apartment);
        }
    }

    public static void main(String[] args){
        ListDriver driver = new ListDriver();
        driver.run();
    }
}