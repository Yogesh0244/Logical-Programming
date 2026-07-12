//program to print nth prime number
public class NthPrimeNumber {
    public static void main(String[] args) {
        int n=4,count=0,num=2;
        while (true) {
            if(isPrime(num)){
                count++;
                if(count==n){
                    System.out.println(num);
                    break;
                }
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
