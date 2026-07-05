//pruduct of each digit i the number
public class ProductOfDigits {
    public static void main(String[] args) {
        int n=234;
        System.out.println(productOfDigits(n));
    }

    public static int productOfDigits(int n){
        int product=1;
        while (n>0) {
            int digit=n%10;
            product=product*digit;
            n=n/10;
        }
        return product;
    }
}
