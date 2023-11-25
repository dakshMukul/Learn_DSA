package algorithms;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {123, 95, 56, 44, 34, 20, 5, 1, -2, -55};
//        int[] arr = {-1, 3, 5, 22, 65, 122, 143, 465};
        int target = -55;
        int result = orderAgnosticBS(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAssending = arr[start] < arr[end];

        while (start <= arr.length){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAssending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
