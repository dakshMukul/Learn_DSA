package JavaPrograms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        int val = 0;
        for(int i = nums.length; i < ans.length; i ++){
            ans[i] = nums[val];
            val++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,1};

        int[] result = ConcatenationOfArray.getConcatenation(nums);

        for(int i = 0; i < result.length; i ++){
            System.out.print(result[i]);
        }
    }
}
