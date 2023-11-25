package JavaPrograms.Arrays;

public class FindEverDigitNum {
        public int findNumbers(int[] nums) {
            int count = 0;
            for(int i : nums){
                if(evenDigit(i)){
                    count++;
                }
            }
            return count;
        }
        public boolean evenDigit(int num){
            return countDigit(num) % 2 == 0;
        }
        public int countDigit(int num){
            int digit = 0;
            while(num > 0){
                num /= 10;
                digit ++;
            }
            return digit;
        }

    public static void main(String[] args) {
        FindEverDigitNum obj = new FindEverDigitNum();
        int[] arr = {12,345,2,6,7896};
        System.out.println(obj.findNumbers(arr));
    }
}

