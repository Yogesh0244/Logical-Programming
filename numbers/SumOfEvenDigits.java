//program to find sum of even digits in the number
public class SumOfEvenDigits {
    public static void main(String[] args) {
        int n=654321;
        System.out.println(sumOfEvenDigits(n));
    }

    public static int sumOfEvenDigits(int n){
        int sum=0;
        while (n>0) {
            int digit=n%10;
            if(digit%2==0)
                sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
}
