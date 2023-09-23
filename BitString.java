import java.math.BigInteger;
import java.util.Scanner;

public class BitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        //BigInteger num = new BigInteger(n);
        BigInteger two = new BigInteger("2");
        BigInteger b1 = two.pow(n);
        BigInteger ten = new BigInteger("1000000007");
        BigInteger out = b1.remainder(ten);
        System.out.println(out);
    }
}
