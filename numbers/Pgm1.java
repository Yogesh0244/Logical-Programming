//find the biggest among the 3 numbers using if statement

public class Pgm1 {

    public static void main(String[] args) {
        int a=5,b=9,c=7;
        int max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;

        System.out.println(max);
    }
}