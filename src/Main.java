import AlgoRun.RunBubbleSort;
import AlgoRun.RunSelectionSort;
import AlgoRun.RunUCS;
import Problems.FindTheSmallestLetterGreaterThanTarget;
import Problems.SearchInsertionPosition;

public class Main {
    public static void main(String[] args) {
//        RunBubbleSort rbs = new RunBubbleSort();
//        RunSelectionSort rss = new RunSelectionSort();

//        SearchInsertionPosition sip = new SearchInsertionPosition();
//        int[] nums = {1,3,5,6};
//        System.out.println(sip.searchInsert(nums, 2));

        FindTheSmallestLetterGreaterThanTarget search = new FindTheSmallestLetterGreaterThanTarget();

        char[] letters = {'c','f','j'};

        System.out.println(search.nextGreatestLetter(letters, 'd'));
    }
}
