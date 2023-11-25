package algorithms.pattern;
/*
*   1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
* */
public class pattern_4 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+ 1);
            }
            System.out.println(" ");
        }
    }
}
