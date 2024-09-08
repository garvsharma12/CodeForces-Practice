import java.util.*;
public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean b = true;
            for(int i=0 ;i<n;i++){
                arr[i]=sc.nextInt();
                if(i==0 && arr[i]!=1){
                    //System.out.println("NO");
                    b=false;
                }
            } 
            if(b) System.out.println("YES");
            else System.out.println("NO");
            // if(arr[1]!=1){
            //     System.out.println("NO");
            //     continue;
            // }
            //
            // for(int i=1 ; i<n ; i++){
            //     if(arr[arr[i]]!=i && arr[i]!=arr[arr[i]]){
            //         System.out.println("NO");
            //         b=false;
            //         break;
            //     }
            // }
            // if(b) System.out.println("YES");
        }
    }
}
