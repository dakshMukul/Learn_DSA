package algorithms.Search.BinarySearch;

public class SmallestLetter744 {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
        char target = 'c';

        char ans = nextGreatestCharacter(letters, target);
        System.out.println(ans);
    }
    /*You are given an array of characters letters that is sorted in non-decreasing order,
 and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.*/
    public static char nextGreatestCharacter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If start is out of bounds, return the first character in letters
        // Otherwise, return the character at index start
        return (start < letters.length) ? letters[start] : letters[0];
    }
}

