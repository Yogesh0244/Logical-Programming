//counting how many digits present in a number
public class CountingDigits {
    public static void main(String[] args) {
        int n=4321;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int n){
        int count=0;

        while(n>0){
            int digit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}
