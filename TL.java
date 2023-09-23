import java.util.Arrays;
import java.util.Scanner;
public class TL {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] n1 = new long[n];
            long[] m1 = new long[m];
            for(int i=0 ; i<n ; i++)
                n1[i]=sc.nextLong();
            for(int i=0 ; i<m ; i++)
                m1[i] =sc.nextLong();
            Arrays.sort(m1);
            Arrays.sort(n1);
            long mn = n1[0]*2;
            mn = Math.max(mn, m1[n-1]);
            
        }
    }
}
