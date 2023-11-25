package JavaPrograms.Arrays;
  /* Given the array nums consisting of 2n elements in the form
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
  */
public class ShuffleTheArray {
      public static int[] shuffle(int[] nums, int n) {
          int[] ans = new int[n*2];

          for (int i = 0; i < n; i++) {
              ans[2*i] = nums[i];
              ans[(2*i) +1] = nums[i + n];
          }
          return ans;
      }

      public static void main(String[] args) {
         int[] nums = {2,5,1,3,4,7};
         int n = 3;

         int[] result = shuffle(nums, n);

         for (int i : result){
             System.out.print(i);
         }

      }
  }
