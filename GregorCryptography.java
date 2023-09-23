import java.util.Scanner;

public class GregorCryptography {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
                long n = sc.nextLong();
                if(n==5 ) System.out.println(2+" "+4);
                else {
                    long k = n/2;
                    System.out.println(2+" "+k);
                }
            }
        }
    }
}
