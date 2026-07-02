//program to check the given number is prime or not
public class PrimeNumber { 
    public static void main(String[] args) {
        int n= 13;
        boolean res=isPrime(n);
        if(res==true)
            System.out.println("prime number");
        else
            System.out.println("not a prime");
    }
    public static boolean isPrime(int n){
        while(n<=1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
