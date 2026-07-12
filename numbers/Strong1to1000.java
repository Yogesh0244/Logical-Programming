//program to print all the strong numbers present between 1 to 1000
//A strong number is a special type of number in mathematics. It’s defined as a number in which the sum of the factorials of its digits equals the number itself.
public class Strong1to1000 {
    public static void main(String[] args) {
        for(int i=1; i<=1000; i++){
            if(strong(i))
                System.out.println(i);
        }
    }

    public static boolean strong(int n){
        int t=n;
        int sum=0;
        while(t!=0){
            int digit=t%10;
            int f=factorial(digit);
            sum=sum+f;
            t=t/10;
        }
        return sum==n;
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
}
