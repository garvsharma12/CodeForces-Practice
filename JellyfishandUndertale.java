
import java.util.*;
public class JellyfishandUndertale {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int setTo=sc.nextInt();
            int timer = sc.nextInt();
            int n = sc.nextInt();
            long res=timer;
            for(int i=0 ;i<n ;i++){
                int val=sc.nextInt();
                res+=Math.min(setTo-1,val);
            }
            System.out.println(res);
        }        
    }
}
