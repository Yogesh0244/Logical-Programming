//progarm to convert decimal number to binary number
public class DecimaltoBinary {
    public static void main(String[] args) {
        int dec=14;
        System.out.println(decToBin(dec));
    }
    public static String decToBin(int dec){
        String bin=" ";
        while (dec>0) {
            int rem=dec%2;
            bin=rem+bin;
            dec=dec/2;
        }
        return bin;
    }
}
