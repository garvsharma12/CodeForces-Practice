import java.util.Arrays;
import java.util.Scanner;

public class HossamCombinatorics {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();

            int mx= Arrays.stream(arr).max().getAsInt();
            int mn = Arrays.stream(arr).min().getAsInt();

            if(mn==mx){
                long k = n;
                long ff = k*(k-1);
                System.out.println(ff);
            }
            else{
                long cntMN=0 , cntMX=0;
                for(int i=0 ;i<n ;i++){
                    if(arr[i]==mn) cntMN++;
                    else if(arr[i]==mx) cntMX++;
                }
                long out = 2*(cntMN*cntMX);
                System.out.println(out);
            }
        }   
    }
}
