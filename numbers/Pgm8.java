//program to find the factors\divisors of given number
public class Pgm8 {
    public static void main(String[] args) {
        int n=25;

        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        System.out.println(n);
    }
}
