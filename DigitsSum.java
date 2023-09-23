import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            while(t-->0)
            {
                long n = sc.nextLong();
                long output = (long)((n+1)/10);
                System.out.println(output);
            }
        }
    }
}
