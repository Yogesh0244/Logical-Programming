//program to print first n fibonacci series
public class FirstNFibonacci {
    public static void main(String[] args) {
        int n=10;
        int f1=0, f2=1, sum=10;
        System.out.println(f1+" "+f2+" ");
        for(int i=1; i<=n-2; i++){
            sum=f1+f2;
            System.out.println(sum+" ");
            f1=f2;
            f2=sum;
        }
    }
}
