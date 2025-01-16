package Strategy;

/*
 * Written by Jerard Austin
 */

import java.util.ArrayList;

public class BubbleSort implements SortBehavior{
    
    public ArrayList<Apartment> sort(ArrayList<Apartment> apartments){
        ArrayList<Apartment> sortedList = new ArrayList<>(apartments);
        int num = sortedList.size();
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (sortedList.get(j).compareTo(sortedList.get(j + 1)) > 0) {
                    Apartment temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }

    return sortedList;   
    }

}
