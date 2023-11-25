package algorithms.sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort{

    public static void bubbleSort(int[] array){
        int n = array.length;
        for(int i = n -1; i > 0; i--){
            boolean swapped = false;

            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        bubbleSort(array);
        
        System.out.println(Arrays.toString(array));
    }
}