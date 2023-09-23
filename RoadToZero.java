import java.math.BigInteger;
import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int a = sc.nextInt();
            String A = Integer.toString(a);
            BigInteger A1 = new BigInteger(A);
            int b = sc.nextInt();
            String B = Integer.toString(b);
            BigInteger B1 = new BigInteger(B);
            int x = sc.nextInt();
            String X = Integer.toString(x);
            BigInteger X1 = new BigInteger(X);
            int y = sc.nextInt();
            String Y = Integer.toString(y);
            BigInteger Y1 = new BigInteger(Y);
            BigInteger out;

            if(a==0 && b==0){
                System.out.println(0);
                continue;
            }
            else if(a==0 && b!=0){
                out = B1.multiply(X1);
                System.out.println(out);
                continue;
            }
            else if(a!=0 && b==0){
                out = A1.multiply(X1);
                System.out.println(out);
                continue;
            }
            else{
                BigInteger temp1=(A1.multiply(X1)).add(B1.multiply(X1));
                BigInteger mn=(A1).min(B1);
                BigInteger mx=(A1).max(B1);
                BigInteger temp2 = (Y1.multiply(mn)).add((mx.subtract(mn)).multiply(X1));
                mn= temp1.min(temp2);
                System.out.println(mn);
                continue;
            }

        }
    }
}
