import java.util.Scanner;

public class BurenkaPlayswithFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long x = a*d , y=b*c;
            if (x == y)
                System.out.println(0);
            else if (y != 0 && x % y == 0 || x != 0 && y % x == 0)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
