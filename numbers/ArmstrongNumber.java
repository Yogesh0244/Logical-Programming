//Program to check the given number is Armstrong number or not
//A number is an Armstrong number if the sum of its digits each raised to the power of the number of digits equals the number itself.
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        if(isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }

    public static boolean isArmstrong(int n){
        int sum=0,temp=n;
        int cd=countDigits(n);
        while(n>0){
            int digit=n%10;
            int pow=power(digit,cd);
            sum=sum+pow;
            n=n/10;
        }
        return sum==temp;
    }

    public static int power(int n,int p){
        int pow=1;
        for(int i=1;i<=p;i++){
            pow=pow*n;
        }
        return pow;
    }

    public static int countDigits(int n){
        int count=0;
        while (n>0) {
            int digit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}
