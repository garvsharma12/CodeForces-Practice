import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int s1=sc.nextInt();
                int s2 = sc.nextInt();
                int s3 = sc.nextInt();
                int s4 = sc.nextInt();

                int q1 = Math.max(s1,s2);
                int z1 = Math.min(s1,s2);
                int z2 = Math.min(s3,s4);
                int q2 = Math.max(s3,s4);

                if(q1>z2 && q2>z1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
