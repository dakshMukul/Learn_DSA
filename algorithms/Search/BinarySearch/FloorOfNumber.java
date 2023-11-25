package algorithms.Search.BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 8;
        int result = floorOFANumber(arr, target);

        System.out.println("Ceiling of the "+ target + " is = " + result);
    }
    public static int floorOFANumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[arr.length-1]){
                return -1;
            }
            if(target == arr[mid]){
                return arr[mid];
            }
            if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return arr[end];
    }
}
