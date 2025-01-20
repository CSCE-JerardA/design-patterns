package Strategy;

/*
 * Written by Jerard Austin
 */

import java.util.ArrayList;;

public class QuickSort implements SortBehavior {
    @Override
    public ArrayList<Apartment> sort(ArrayList<Apartment> apartments){
        ArrayList<Apartment> sortedList = new ArrayList<>(apartments);
        quickSort(sortedList, 0, sortedList.size() - 1);
        return sortedList;
    }

    private void quickSort(ArrayList<Apartment> list, int low, int high) {
        while (low < high) {
            int port = portions(list, low, high);
            if (port - low < high - port) {
                quickSort(list, low, port - 1);
                low = port + 1;
            } else {
                quickSort(list, port + 1, high);
                high = port - 1;
            }
        }
    }

    private int portions(ArrayList<Apartment> list, int low, int high) {
        Apartment point = list.get(low + (high - low) / 2);
        int l = low;
        int h = high;
        while (l <= h) {
            while (list.get(l).compareTo(point) < 0) {
                l++;
            }
            while (list.get(h).compareTo(point) > 0) {
                h--;
            }
            if (l <= h) {
                Apartment temp = list.get(l);
                list.set(l, list.get(h));
                list.set(h, temp);
                l++;
                h--;
            }
        }
        return l;
    }



}
