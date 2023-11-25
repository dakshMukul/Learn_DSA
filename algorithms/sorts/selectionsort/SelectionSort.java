package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    
    //4,2,6,5,1,3

    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++ ){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp; 
            }
        }
    }
    
    public static void main(String[] args){
        int[] array = {4,2,6,5,1,3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
