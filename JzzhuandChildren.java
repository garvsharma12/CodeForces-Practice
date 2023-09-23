import java.util.Arrays;
import java.util.Scanner;

public class JzzhuandChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<n ;i++){ 
            arr[i]=sc.nextInt();
        }
        int mx = Arrays.stream(arr).max().getAsInt();
       // System.out.println(Arrays.toString(arr));
        for(int i=0 ;i<n ; i++){
            if(arr[i]<=k) arr[i]=0;
            else {
                arr[i]/=k;
            }
        }
        System.out.println(Arrays.toString(arr));
        if(mx<=k){ System.out.println(n);}
        else {
        for(int i=0 ; i<n ;i++){
            if(arr[i]>0) {
                System.out.println(i+1);
                break;
            }
        }
        }
    }
}
