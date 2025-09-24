package Sorting;

import Helpers.Swap;

public class QuickSort {

    private final int[] list;

    public QuickSort(int[] unsortedList){
        this.list = unsortedList;
    }

    public int[] sort(){
        quickSort(this.list, 0, this.list.length - 1);
        return this.list;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                Swap.swap(arr, i, j);
            }
        }

        Swap.swap(arr, i + 1, high);
        return i + 1;
    }
}
