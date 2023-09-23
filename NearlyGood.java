import java.math.BigInteger;
import java.util.Scanner;

public class NearlyGood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger A = new BigInteger(Integer.toString(a)); 
        BigInteger BB = new BigInteger(Integer.toString(b)); 
        BigInteger B = new BigInteger(Integer.toString(b+1));
        if((b==1)){
            System.out.println("NO");
            //System.out.println(-1);
            continue;
        }
        BigInteger z = A.multiply(B);
        BigInteger x = A;
        BigInteger y = BB.multiply(A);
        System.out.println("YES");
        System.out.println(x+" "+y+" "+z);
        }
    }
}
