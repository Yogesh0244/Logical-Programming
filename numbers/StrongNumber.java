//program to check the given number is strong number or not
//A number is called strong if the sum of the factorials of its digits equals the number itself.
public class StrongNumber {
    public static void main(String[] args) {
        int n=145;
        if(isStrong(n))
            System.out.println("Strong number");
        else
            System.out.println("Not strong");
    }

    public static boolean isStrong(int n){
        int sum=0;
        int original=n;
        while (n>0) {
            int digit=n%10;
            int f=factorial(digit);
            sum=sum+f;
            n=n/10;
        }
        return sum==original;
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        return fact;
    }
}
