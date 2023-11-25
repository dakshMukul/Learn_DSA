package algorithms.Search.BinarySearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int[] ans = searchRange(nums, target);
        for(int i : ans){
            System.out.print(i);
        }
    }
    /*
    * Given an array of integers nums sorted in non-decreasing order,
    *  find the starting and ending position of a given target value.
    * If target is not found in the array, return [-1, -1].
    * You must write an algorithm with O(log n) runtime complexity.
    */
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] ans = {-1, -1};
        if(nums.length == 1 && target == nums[0]){
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid == nums.length-1 && nums[mid] == target){
                ans[0] = mid;
                ans[1] = mid;
                return ans;
            }
            if( target == nums[mid]){
                if(nums[mid -1 ] == nums[mid]){
                    ans[0] = mid -1;
                    ans[1] = mid;
                }else if (nums[mid +1 ] == nums[mid]){
                    ans[0] = mid;
                    ans[1] = mid + 1;
                }else{
                    ans[0] = mid;
                    ans[1] = mid;
                }
                return ans;
            }
            if (target > nums[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
