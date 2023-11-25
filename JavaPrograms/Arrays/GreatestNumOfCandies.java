package JavaPrograms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int lowestIndex = 0;
        for(int i : candies){
            candies[i] = candies[i] + 3;
        }
        for (int i = 0; i < candies.length-1; i++) {
            if(candies[i + 1] < candies[lowestIndex]){
                lowestIndex = candies[i + 1];
            }
        }
        for(int i : candies){
            ans.add(i, true);
        }
        ans.add(lowestIndex, false);
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

}
