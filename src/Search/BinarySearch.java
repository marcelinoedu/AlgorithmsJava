package Search;

import java.util.ArrayList;

public class BinarySearch {

    private int[] sortedList;


    public BinarySearch(int[] sortedList){
            this.sortedList = sortedList;
    }

    public int search(int goal_number){
        int inicio_index = 0;
        int fim_index = this.sortedList.length;

        while (inicio_index < fim_index){
            int meio_index =  (inicio_index + fim_index) / 2;
            int actual_number = this.sortedList[meio_index];
            if(actual_number == goal_number) {
                return meio_index;
            } else if (actual_number < goal_number) {
                inicio_index = meio_index + 1;
            } else {
                fim_index = meio_index - 1;
            }
        }
        return -1;
    }
}
