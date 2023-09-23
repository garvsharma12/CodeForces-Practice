import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long out = 1;
            long[] arr = new long[n];
            long temp=Long.MAX_VALUE;
            for(int i=0 ;i<n ;i++){
                 arr[i] = sc.nextInt();
                 temp=Math.min(temp,arr[i]);
            }
            boolean b =true;
            for(int i=0 ;i<n ;i++){
                if(arr[i]==temp && b){
                    out*=(arr[i]+1);
                    b=false;
                }
                else out*=arr[i];
            }
            System.out.println(out);
        }
        
}
}
