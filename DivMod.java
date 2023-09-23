import java.util.Scanner;

public class DivMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int l = sc.nextInt();
            int r =sc.nextInt();
            int a = sc.nextInt();
            int ans = r /a + r %a;
            int m = r / a* a - 1;
            if(m >= l) ans = Math.max(ans, m /a + m %a);
            System.out.println(ans);
        }
    }
}