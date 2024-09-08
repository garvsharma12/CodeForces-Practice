import java.util.Scanner;

public class LuntikandSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int zero=0 , one=0;
            while(n-->0){
                int x=sc.nextInt();
                if(x==0) zero++;
                else if(x==1) one++;
            }
                long res = (long)one*(long)Math.pow(2,zero);
                System.out.println(res);
        }
    }
}
