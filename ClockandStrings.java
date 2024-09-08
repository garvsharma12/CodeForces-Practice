import java.util.HashSet;
import java.util.Scanner;

public class ClockandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            /*HashSet<Integer> hs1 = new HashSet<>();
            int mn = Math.min(a,b);
            int mx = Math.max(a,b);
            while(mn<=mx){
                if(mn<=12) hs1.add(mn);
                else{
                    hs1.add(mn%12);
                    mn%=12;
                } 
                mn++;
            }
            if((hs1.contains(c) && hs1.contains(d)) ||(!hs1.contains(c) && !hs1.contains(d)))
                System.out.println("NO");
            else System.out.println("YES");
            */
            a = Math.min(a,b);
            b = Math.max(a,b);
            c = Math.min(c,d);
            d = Math.max(c,d);
            int diff1 = b-a;
            int diff2 = d-c;
            diff1 = Math.min(diff1, diff2);
            diff2 = Math.max(diff1, diff2);
            
            if((a<=c && c<=b) || (a<=d && d<=b)){
                System.out.println("YES");
            }
            else if(diff1!=0 && diff2%diff1 ==0){
                System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
