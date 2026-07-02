//pring to find n power p
public class NpowerP {
    public static void main(String[] args) {
        int n=3,p=3;
        System.out.println(power(n,p));
    }
    public static int power(int n,int p){
        int pow=1;
        for(int i=1;i<=n;i++){
            pow=pow*n;
        }
        return pow;
    }
}
