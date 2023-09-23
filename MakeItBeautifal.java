import java.util.Arrays;
import java.util.Scanner;

public class MakeItBeautifal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ; i++) arr[i]=sc.nextInt();
            int mx = Arrays.stream(arr).max().getAsInt();
            int mn = Arrays.stream(arr).min().getAsInt();
            if(mx==mn){
                System.out.println("NO"); continue;
            }
            Arrays.sort(arr);
            int[] out = new int[n];
            int k=0;
            for(int i=0,j=n-1 ;  ; i++,j--){
                out[k]=arr[j]; k++;
                if(k==n) break;
                out[k]=arr[i]; k++; 
                if(k==n) break;
            }
            System.out.println("YES");
            for(int i=0 ; i<n ;i++) System.out.print(out[i]+" ");
            System.out.println();
        }
    }
}
