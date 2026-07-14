/*
    a
    b  b
    c  c  c 
    d  d  d  d
    e  e  e  e  e
*/
public class Pgm12 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+96)+"  ");
            }
            System.out.println();
        }
    }
}
