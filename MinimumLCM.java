import java.util.Scanner;

public class MinimumLCM {
    static long gcd(long a, long b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
    static long lcm(long a , long b){
        long g_cd= gcd(a,b);
        long l_cm= (a*b)/g_cd;
        return l_cm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long n = sc.nextInt();
            if(n%2==0) System.out.println(n/2+" "+n/2);
            else{
                long a=1;
                for(int i=2 ; i*i<=n ; i++){
                    if(n%i==0){
                        a=n/i;
                        break;
                    }
                }
                System.out.println(a+" "+(n-a));
            }
        }
    }
}
