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
                long diff = mx-mn;
                long n = mx+diff-mn;
                if (a > n || b > n || c > n)
			        System.out.println(-1);
                else{
                    long out = (c+diff);
                    if(out>n) out%=n;
                    System.out.println(out);
                }
            }
        }
    }
}
