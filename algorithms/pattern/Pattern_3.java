package algorithms.pattern;

/**
 *  *****
    ****
    ***
    **
    *
 */
public class Pattern_3 {

    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n){
        for (int i = 0; i <= n; i++) {
            for(int j = n-i; j > 0; j --){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}