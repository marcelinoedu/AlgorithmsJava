package Problems;

public class SearchInsertionPosition {


    public int searchInsert(int[] nums, int target) {

        int endIndex = nums.length - 1;
        int beginIndex = 0;

//        System.out.println("aquidahevd: "+ lastVisitedIndex);
        while (beginIndex <= endIndex){
            int midIndex = (beginIndex + endIndex) / 2;
            int midElemnt = nums[midIndex];

            if(midElemnt == target){
                return midIndex;
            } else if (midElemnt < target) {
                beginIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }
//        System.out.println("ultimo: "+ lastVisitedIndex);
        return beginIndex;
    }
}
