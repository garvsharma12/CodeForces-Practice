import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x=0;
            boolean b = true;
            if(n%2==0) System.out.println("YES");
            else if((n%2==0 && k%2==1)||(n%2==1 && k%2==0)) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
