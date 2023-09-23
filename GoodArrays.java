import java.util.*;
public class GoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long sum=0 , cnt_1=0; 
            for(int i=0 ;i<n ;i++){
                int k=sc.nextInt();
                if(k==1) cnt_1++;
                sum+=k;
            }
            if(sum>=cnt_1+n && n>1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
