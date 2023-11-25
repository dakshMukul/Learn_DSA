package JavaPrograms.Arrays;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int count = 0;
        while(n >= count){
            n -= count;
            count++;
        }
        return count-1;
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(arrangeCoins(n));
    }
}
