import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();
             //Arrays.sort(arr);
             int mx = 0 , mx2=0;
            for(int i=0 ;i<n-1 ;i++){
                int mn = Math.min(arr[i],arr[i+1]);
                arr[i]-=mn; arr[i+1]-=mn;
            }
            int out=0;
            for(int i=0 ; i<n ;i++){
                mx=Math.max(mx,arr[i]);
                if(mx!=mx2){
                    out=i+1;
                    mx2=mx;
                }
            }
            System.out.println(out);
        }
    }
}
