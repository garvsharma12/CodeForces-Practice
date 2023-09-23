import java.util.HashSet;
import java.util.Scanner;

public class UniqueBidAuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int val = Integer.MAX_VALUE , szTemp=0 , sz=0 , req=0 , k=0;
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0 ;i<n ;i++){
                k = sc.nextInt();
                if(hs.size()>szTemp){
                    val=Math.min(val,k);
                    szTemp++;
                }
            }
        }
    }
}
