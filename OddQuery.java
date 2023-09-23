//import java.util.Arrays;
import java.util.Scanner;
public class OddQuery {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int  n =sc.nextInt();
                int q = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0 ; i<n ;i++)
                {
                    int k = sc.nextInt();
                    if(i==0) arr[i]= k;
                    else arr[i]=k+arr[i-1];
                }
                while(q-->0)
                {
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int k = sc.nextInt();
                    int ext = ((r-l)+1)*k;
                    int prs=0;
                    if(l==1)
                        prs = arr[n-1]-(arr[r-1])+ext;
                    else 
                        prs = arr[n-1]-(arr[r-1]-arr[l-2])+ext;
                    if(prs%2==0) System.out.println("NO");
                    else System.out.println("YES");
                }
            }
        }
    }
}
