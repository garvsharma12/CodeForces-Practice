import java.util.Scanner;

public class AddAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long a =sc.nextLong();
            long b = sc.nextLong();
            int res=0;
            while(a>b && b!=1){
                a/=b;
                res++;
            }
            while(a!=0){
                a/=b;
                b++;
                res++;
            }
            System.out.println(res);
        }
    }
}
