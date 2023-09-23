import java.util.Arrays;
import java.util.Scanner;

public class ArrayCancellation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n ;i++) arr[i]=sc.nextInt();
            for(int i=n-1 ; i>=0 ; i--){
                if(i==n-1) continue;
                else{
                    arr[i]+=arr[i+1];
                }
            }
            System.out.println(Arrays.stream(arr).max().getAsLong());
        }
    }
}
