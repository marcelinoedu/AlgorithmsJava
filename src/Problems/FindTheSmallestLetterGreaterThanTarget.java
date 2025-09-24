package Problems;

public class FindTheSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        int endIndex = letters.length - 1;
        int beginIndex = 0;

        while (beginIndex <= endIndex) {
            int midIndex = (beginIndex + endIndex) / 2;
            int midChar = letters[midIndex];

            if (midChar <= target) {
                beginIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }

        }
        return letters[beginIndex % letters.length];
    }
}
