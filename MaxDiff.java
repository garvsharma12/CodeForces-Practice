import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxDiff {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int tt = sc.nextInt();
       while(tt-->0){
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0 ;i<n ; i++) arr[i]=sc.nextInt();
          int result = arr[arr.length - 1] - arr[0];
		
            for (int i = 1; i < arr.length; ++i) {
                result = Math.max(result, arr[i - 1] - arr[i] );
            }
            
            for (int i = 1; i < arr.length; ++i) {
                result = Math.max(result, arr[i] - arr[0] );
            }
            
            for (int i = 0; i < arr.length - 1; ++i) {
                result = Math.max(result, arr[arr.length - 1] - arr[i] );
            }

            System.out.println(result);
      }
  }
    
}
