import java.util.Arrays;
import java.util.Scanner;

public class KarinandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0 ; i<n ; i++) arr[i]=sc.nextLong();
            Arrays.sort(arr);
            if(arr.length==2) {
                long out = arr[0]*arr[1];
                System.out.println(out);
            }
            else{
                long out1 = arr[0]*arr[1];
                long out2 = arr[n-1]*arr[n-2];
                long max = Math.max(out1,out2);
                System.out.println(max);
            }
        }
    }
}
