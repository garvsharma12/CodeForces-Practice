import java.util.*;

public class Exciting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a==b){
                System.out.println("0 0");
                continue;
            }
            long gcd = Math.abs(a-b);
            long change = Math.min(a%gcd,gcd-(a%gcd));
            System.out.println(gcd+" "+change);
        }
    }
}
