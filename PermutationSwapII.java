//import java.util.Arrays;
import java.util.Scanner;

public class PermutationSwapII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n=sc.nextInt(),num=0,res=0;
            //int[] freq = new int[200002];
            for(int i=1 ;i<=n ; i++){
                int k =sc.nextInt();
                num=Math.abs(k-i);
                res=gcd(res,num);
            }
            
            System.out.println(res);
        }
    }
    static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }
}
