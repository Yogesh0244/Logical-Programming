//find the smallest number among 4 numbers using if statement
public class Pgm2 {
    public static void main(String[] args) {
        int a=9,b=7,c=5,d=3;
        int min=a;

        if(min>b)
            min=b;
        if(min>c)
            min=c;
        if(min>d)
            min=d;

        System.out.println(min);
    }
}
