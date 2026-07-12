//program to convert a number from binary to decimal
public class BinarytoDecimal {
    public static void main(String[] args) {
        int bin=1101;
        System.out.println(binToDec(bin));
    }

    public static int binToDec(int bin){
        int p=0,sum=0;
        while (bin>0) {
            int digit=bin%10;
            int pow=(int)Math.pow(2,p);
            sum=sum+digit*pow;
            bin=bin/10;
            p++;
        }
        return sum;
    }
}
