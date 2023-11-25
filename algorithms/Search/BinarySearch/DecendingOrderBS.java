package algorithms.Search.BinarySearch;

public class DecendingOrderBS {
    public static void main(String[] args) {
        int[] arr = {123, 95, 56, 44, 34, 20, 5, 1, -2, -55};
        int target = 20;
        int result = decendingOrderbs(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int decendingOrderbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
