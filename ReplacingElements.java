import java.util.Arrays;
import java.util.Scanner;

public class ReplacingElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int d = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();
                Arrays.sort(arr);
                int mx = Arrays.stream(arr).max().getAsInt();
                if(mx<=d) System.out.println("Yes");
                else {
                    int mn1 = arr[0];
                    int mn2 = arr[1];
                    if(mn1+mn2<=d) System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        }
    }
}
