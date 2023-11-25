package algorithms.pattern;

import algorithms.sorts.selectionsort.SelectionSort;
import com.sun.security.jgss.GSSUtil;

/*
*  *
   **
   ***
   ****
   *****
   ****
   ***
   **
   *
* */
public class pattern_5 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int n){
        for (int row = 0; row < 2 * n; row++) {

            int totalColsInRow = row > n ? 2*n - row - 1 : row;

            for (int col = 0; col <= totalColsInRow; col ++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
