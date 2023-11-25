package JavaPrograms.Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

    public static List<Integer> printFibonacci(int num){

        List<Integer> fibonacciList = new ArrayList<>();

        for(int i = 0; i == num; i++){
            int preNum = 1;
            int nextNum = preNum + i;
            fibonacciList.add(nextNum);
            preNum = nextNum;
        }
        return fibonacciList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no till your want fibonacci series");
        int number = scanner.nextInt();

        System.out.println(printFibonacci(number));
    }
}
