import java.util.Scanner;
public class EffectiveApproach
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[n+1];
        for(int i=0 ;i<n ;i++) {
            int k = sc.nextInt();
            pos[k]=i+1;
        }
        int m = sc.nextInt();
        long vasy=0 , pety=0;
        for(int i=0 ;i<m ; i++)
        {
            int q = sc.nextInt();
            vasy+=pos[q];
            pety+=n-pos[q]+1;

        }
        System.out.println(vasy+" "+pety);
        sc.close();
    }

}
