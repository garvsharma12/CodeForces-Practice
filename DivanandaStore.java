import java.util.Arrays;
import java.util.Scanner;

public class DivanandaStore {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                long[] arr = new long[n];
                for(int i=0 ;i<n ; i++) arr[i]=sc.nextLong();
                int count=0;
                Arrays.sort(arr);
                for(int i=0 ;i<n ;i++){
                    if(arr[i]>=l && arr[i]<=r){
                        k-=arr[i];
                        if(k>=0) count++;
                    }
                    if(arr[i]>k || arr[i]>r) break;
                }
                System.out.println(count);
            }
        }
    }
}
