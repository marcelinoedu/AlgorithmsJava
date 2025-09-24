package Sorting;

public class SelectionSort {

    protected final int[] list;

    public SelectionSort(int[] unsortedList){
        this.list = unsortedList;
    }


    public int[] sort(){

        for(int i = 0; i < list.length - 1; ++i){
            int min = i;

            for(int j = i + 1; j < list.length - 1; ++j){
                if(list[j] < list[min]){
                    min = j;
                }
            }

            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;

        }
        return list;
    }
}
