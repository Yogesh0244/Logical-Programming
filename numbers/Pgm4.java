//WAP to print sanju if the no is divisible by 3, print geetha if the no is divisible by
//5,print sanju weds geetha if the number is divisible by 3 & 5 otherwise print breakup

public class Pgm4 {
    public static void main(String[] args) {
        int n=15;

        if(n%3==0 && n%5==0)
            System.out.println("Sanju weds geetha");
        else if(n%3==0)
            System.out.println("sanju");
        else if(n%5==0)
            System.out.println("geetha");
        else
            System.out.println("breakup");
    }
}
