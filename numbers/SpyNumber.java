//program to check the given number is spy or not
//A number is called a spy number if the sum of its digits is equal to the product of its digits.
public class SpyNumber {
    public static void main(String[] args) {
        int n=22;
        if(isSpy(n))
            System.out.println("Spy number");
        else
            System.out.println("Not spy");
    }

    public static boolean isSpy(int n){
        int sum=0,product=1;
        while (n>0) {
            int digit=n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;
        }
        return sum==product;
    }
}
