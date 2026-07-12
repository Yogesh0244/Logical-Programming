//program to convert number from decimal to hexadecimal
public class DecimaltoHexa {
    public static void main(String[] args) {
        int dec=31;
        System.out.println(decToHex(dec));
    }

    public static String decToHex(int dec){
        String hexa=" ";
        while (dec>0) {
            int rem=dec%16;
            if(rem>9)
                hexa=(char)(rem+55)+hexa;
            else
                hexa=rem+hexa;
            dec=dec/16;
        }
        return hexa;
    }
}
