package JavaPrograms.Arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {

        // first method
//        int[] ans = new int[nums.length];
//        int preValSum = 0;
//
//        for(int i = 0; i < ans.length; i++){
//            ans[i] = preValSum + nums[i];
//            preValSum = ans[i];
//        }
        //second method
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();
        int[] nums = {1,2,3,4};

        int[] result = runningSum.runningSum(nums);

        for(int i : result){
            System.out.print(i);
        }
    }
}
