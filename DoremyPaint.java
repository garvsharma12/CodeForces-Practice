import java.util.*;

public class DoremyPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0 ; i< n;i++){
                int x=sc.nextInt();
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
            if(n==1) System.out.println("NO");
            else if (hm.size()>2) System.out.println("NO");
            else{
                int diff=-1;
                if(hm.size()==1){
                    System.out.println("YES"); continue;
                }
                for(int x:hm.values()){
                    if(diff==-1) diff=x;
                    else{
                        diff=Math.abs(diff-x);
                    }
                }
                if(diff<=1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
