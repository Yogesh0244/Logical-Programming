//program to find sum of all the factors of given number
public class Pgm10 {
    public static void main(String[] args) {
        int n=19, sum=0;

        for(int i=1;i<=n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
