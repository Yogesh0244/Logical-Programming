//program to find the given number is neon number or not
//A number is neon if the sum of the digits of its square equals the number itself.
public class NeonNumber {
    public static void main(String[] args) {
        int n=9;
        if(isNeon(n))
            System.out.println("Neon number");
        else
            System.out.println("Not neon");
    }
    public static boolean isNeon(int n){
        int sq=n*n;
        int sum=0;
        while (sq>0) {
            int digit=sq%10;
            sum=sum+digit;
            sq=sq/10;
        }
        return n==sum;
    }
}
