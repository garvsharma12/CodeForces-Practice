import java.util.Scanner;

public class KDevisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();;
                long out = (n+k-1)/k;
                k*=out;
                System.out.println((k+n-1)/n);
        }
        sc.close();
    }
}
