package Sorting;

public class SelectionSort {

    protected final int[] list;
    public SelectionSort(int[] unsortedList){
        this.list = unsortedList;
    }


    public int[] sort(){

        for(int i = 0; i <= this.list.length - 2; ++i) {

            int min = i;
            for (int j = i + 1; j <= this.list.length - 1; ++j) {
                if (this.list[j] < this.list[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = this.list[i];
                this.list[i] = this.list[min];
                this.list[min] = temp;
            }
        }
        return this.list;
    }
}
