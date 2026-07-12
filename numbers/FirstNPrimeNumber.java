//program to check first n prime numbers
public class FirstNPrimeNumber {
    public static void main(String[] args) {
        int n=10,count=0,num=2;
        while (count<n) {
            if(isPrime(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2; i<=n/2; i++){
            if(n%2==0)
                return false;
        }
        return true;
    }
}
