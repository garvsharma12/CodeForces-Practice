import java.util.Arrays;
import java.util.Scanner;

public class LunaticNeverContent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ; i++) arr[i]=sc.nextInt();
            int gcd = 0;
            for (int i = 0; i < arr.length; i++) {
                gcd = getGCD(gcd, (int)Math.abs(arr[i]-arr[n-i-1]));
            }
            System.out.println(gcd);
        }
}

    
    static int getGCD(int a, int b)
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
}

