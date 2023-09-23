import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt() ,n1 =0;
            for(int i=1 ;i<=n ; i++){
                int k = sc.nextInt();
                n1+=k;
            }
            if((n1%2==0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
