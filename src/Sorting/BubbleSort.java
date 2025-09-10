package Sorting;

public class BubbleSort {

    private final int[] list;

    public BubbleSort(int[] unsortedList){
        this.list = unsortedList;
    }



    public int[] sort(){
        boolean trocou = true;
        int c = 0;
        while(trocou){

            trocou = false;

            for(int i = 0; i < list.length - 1; ++i){
                if(list[i] > list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    trocou = true;
                }
            }

           ++c;
        }
        System.out.println(c);
        return this.list;
    }
}
