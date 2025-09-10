package AlgoRun;


import Sorting.SelectionSort;

import java.util.Arrays;

public class RunSelectionSort {


    private final SelectionSort selectionSort;
    public RunSelectionSort(){
        int[] unsortedList = {3, 4, 2, 5, 77, 8, 12};
        this.selectionSort= new SelectionSort(unsortedList);
    }

    public void run(){
        int[] sortedList = this.selectionSort.sort();
        System.out.println("Sorted List: " + Arrays.toString(sortedList));
    }
}
