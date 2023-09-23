import java.util.Arrays;
import java.util.Scanner;

public class DivideAndMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long out=1;
            for(int i=0 ;i<n ;i++){
                arr[i]=sc.nextInt();
                while(arr[i]%2!=1){
                    out*=2;
                    arr[i]/=2;
                }
            }
            int mx = Arrays.stream(arr).max().getAsInt();
            out*=mx;
            boolean b = true;
            for(int i=0 ;i<n ; i++){
                if(arr[i]==mx && b){
                    b=false; continue;
                }
                else out+=arr[i];
            }
            System.out.println(out);
        }
    }
}
