package AlgoRun;

import Sorting.BubbleSort;

import java.util.Arrays;

public class RunBubbleSort {

    private final BubbleSort bubbleSort;
    public RunBubbleSort(){
        int[] unsortedList = {3, 4, 2, 5, 77, 8, 12};
        this.bubbleSort= new BubbleSort(unsortedList);
    }

    public void run(){
        int[] sortedList = this.bubbleSort.sort();
        System.out.println("Sorted List: " + Arrays.toString(sortedList));
    }
}
