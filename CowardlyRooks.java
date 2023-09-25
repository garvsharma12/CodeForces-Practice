import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CowardlyRooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int i=0 ;i<n ;i++){
                int r = sc.nextInt();
                int c = sc.nextInt();
                hm.put(r-1,c-1);
            }
            String out = m==n?"NO":"YES";
            System.out.println(out);
        }
    }
}
