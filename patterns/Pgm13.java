/*
    A
    b  b
    C  C  C
    d  d  d  d
    E  E  E  E  E
*/
public class Pgm13 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0)
                    System.out.print((char)(i+96)+"  ");
                else
                    System.out.print((char)(i+64)+"  ");
            }
            System.out.println();
        }
    }
}
