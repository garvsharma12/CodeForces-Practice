import java.util.*;
public class VladBuildingBeautifulArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int cnt_O=0 , cnt_E=0;
            int mn_O=Integer.MAX_VALUE , mn_E=Integer.MAX_VALUE;
            for(int i=0 ;i<n ;i++){
                int k = sc.nextInt();
                if(k%2==0){
                    cnt_O++;
                    mn_E=Math.min(mn_E,k);
                }
                else{
                    cnt_E++;
                    mn_O=Math.min(mn_O,k);
                }

            }
            if(cnt_O==0 || cnt_E==0) System.out.println("yes");
            else if(mn_E>mn_O) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
