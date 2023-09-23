import java.util.*;
public class Emordnilap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        long[] fact = new long[100006];
        fact[0]=1;
        for(int i = 1; i <= 100005; i++){
            fact[i] = fact[i - 1] * i;
            fact[i] %= 1000000007;
        }
        while(tt-->0){
            long n = sc.nextLong();
            long num=1;
            num*=(n*(n-1));
            num%=1000000007;
            long ans = (num*fact[(int)n])%1000000007;
            System.out.println(ans);
        }
    }
}
