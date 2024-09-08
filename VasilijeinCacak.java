import java.util.*;
public class VasilijeinCacak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long n = sc.nextLong();
            long m =sc.nextLong();
            long tar = sc.nextLong();
            long x1 = (1 + m) * m / 2;
            long x2 = (m+n)*m/2;
        if (tar >= x1 && tar <= x2) {
            System.out.println("YES");
        } 
        else {
            System.out.println("NO");
        }
        System.out.println(x1+" "+x2);
        }
    }
}