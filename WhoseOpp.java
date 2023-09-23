import java.util.Scanner;

public class WhoseOpp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();

                long mx =Math.max(a,b);
                long mn = Math.min(a,b);
                if(mx==mn || c==mx || c==mn || mx<=mn*2) System.out.println(-1);
                else 
                {
                    long val = mx-mn-1;
                    long sz = mx+val-(mn-1);
                    if(sz<c*2) System.out.println(1);
                    else System.out.println(c*2);
                    //System.out.println(sz+" @");
                }
            }
        }
    }
}
