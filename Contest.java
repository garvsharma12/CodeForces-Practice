import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int mx1 = Math.max((3*a)/10,a-(((a/250))*c));
            int mx2 = Math.max((3*b)/10,b-(((b/250))*d));
            if(mx1>mx2) System.out.println("Misha");
            else if(mx1<mx2) System.out.println("Vasya");
            else System.out.println("Tie");
        }
    }
}
