import java.util.Scanner;

public class TwoPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b) % 3 == 0 && 2 * a >= b && 2 * b >= a ){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
