//program to count the prime digit in the number
public class CountPrimeDigit {
    public static void main(String[] args) {
        int n=23456;
        System.out.println(countPrimeDigits(n));
    }

    public static int countPrimeDigits(int n){
        int count=0;
        while (n>0) {
            int digit=n%10;
            if(digit==2 || digit==3 || digit==5 || digit==7)
                count++;
            n=n/10;
        }
        return count;
    }
}
