import java.util.Scanner;

public class Positions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int minus = Math.min(a,b);
        System.out.println(n-minus);

        sc.close();
    }
}
