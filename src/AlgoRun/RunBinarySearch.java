package AlgoRun;

import Search.BinarySearch;

public class RunBinarySearch {

    public RunBinarySearch(){

    }

    public void run(){
        int[] sortedList = {0,1,2,3,4,5,6,7};
        BinarySearch bs = new BinarySearch(sortedList);
        int found_index = bs.search(6);
        System.out.println(found_index);
    }
}
