//program to check given number is perfect number or not
//A number is called perfect if it is equal to the sum of its proper divisors (all divisors excluding the number itself).
public class PerfectNumber {
    public static void main(String[] args) {
        int n=29;
        isPerfect(n);
    }
    public static void isPerfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n)
            System.out.println("Perfect");
        else
            System.out.println("not perfect");

    }
}