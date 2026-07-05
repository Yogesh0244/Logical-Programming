//program to find count of odd digits in the number
public class CountOfOddDigits {
    public static void main(String[] args) {
        int n=654321;
        System.out.println(countOfOddDigits(n));
    }

    public static int countOfOddDigits(int n){
        int count=0;
        while (n>0) {
            int digit=n%10;
            if(digit%2==0)
                count++;
            n=n/10;
        }
        return count;
    }
}
