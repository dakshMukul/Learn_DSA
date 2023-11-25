package algorithms.Search.BinarySearch;

public class AssendingOrderBS {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 5, 22, 65, 122, 143, 465};
        int target = 465;
        int result = assendingOrderbs(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int assendingOrderbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//            int mid = (end + start) /2; there is a problem with this approch
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
