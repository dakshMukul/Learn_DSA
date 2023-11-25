package JavaPrograms.Arrays;

public class NextGreatestTarget {
    public static char nextGreatestTarget(char[] letters, char target){
       for (int i = 0; i < letters.length; i++) {
            if (target == letters[i]){
                return letters[i + 1];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
      char[]  letters = {'c', 'f', 'j'};
      char target = 'd';
        System.out.println(nextGreatestTarget(letters, target));
    }
}
