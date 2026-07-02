//program to find the sum of digit 
public class SumOfDigit {
    public static void main(String[] args) {
        int n=234;
        System.out.println(sumOfDigit(n));
    }
    public static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }

        return sum;
    }
    
}
