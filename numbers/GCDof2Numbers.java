//program to find the gcd of given two numbers
public class GCDof2Numbers {
    public static void main(String[] args) {
        int a=20, b=28;
        System.out.println(gcd(a,b));
    }

    public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            temp=a;
        }
        return a;
    }
}
