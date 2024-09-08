import java.util.*;
public class MakeAllEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int copy=n;
            HashMap<Integer,Integer> hm = new HashMap<>();
            while(n-->0){
                int x=sc.nextInt();
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
            int mx = Collections.max(hm.values());
            System.out.println(copy-mx);
        }
    }
}
