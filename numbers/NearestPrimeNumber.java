//program to check the nearest prime number of given number
public class NearestPrimeNumber {
    public static void main(String[] args) {
        int n=15;
        if(isPrime(n)){
            System.out.println(n);
            return;
        }
        int prev=n-1, next=n+1;
        while (true) {
            if (isPrime(prev)) {
                System.out.println(prev);
                break;
            }
            else if (isPrime(next)) {
                System.out.println(next);
                break;
            }
            prev--; next++;
        }
    }

    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
