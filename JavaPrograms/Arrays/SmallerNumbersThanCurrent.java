package JavaPrograms.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThanCurrent(nums);

        for (int i : ans){
            System.out.print(i);
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for(int j : nums){
                if(j == nums[i]){
                    ans[i] = ans[i] +1;
                }
            }
        }
        return ans;
    }
}
