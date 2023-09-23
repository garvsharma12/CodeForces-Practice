import java.util.Scanner;

public class LuntikConcerts {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t  =sc.nextInt();
            while(t-->0)
            {
                long a = sc.nextLong();
                long b  =sc.nextLong();
                b*=2;
                long c = sc.nextLong();
                c*=3;
                long sum = a+b+c;
                System.out.println(sum%2);
            }
        }
    }
}
