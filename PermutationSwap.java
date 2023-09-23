import java.util.Arrays;
import java.util.Scanner;

public class PermutationSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] a1 = new int[n];
            for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();
            a1 = Arrays.copyOfRange(arr, 0, n);
            Arrays.sort(a1);
            System.out.println(Arrays.toString(a1));
            int k =Integer.MAX_VALUE ;
            for(int i=0 , j=n-1; i<j ; i++ , j--){
                if(arr[a1[i]]==a1[arr[a1[i]]]) {
                    k=Math.min(k,Math.abs(arr[i]-a1[i]));
                }
            }
            System.out.println(k);
        }
    }
}
