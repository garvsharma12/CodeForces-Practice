import java.util.Scanner;

public class DivideBySixAndMultiplyByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n==1){
                System.out.println(0);
                continue;
            }
            if(n%2!=0 && n%3!=0){
                System.out.println(-1);
                continue;
            }
            else if(n%3!=0){
                System.out.println(-1); continue;
            }
            int count2=0;
            while(n%2==0){
                n/=2; count2++;
            }
            int count3=0;
            while(n%3==0){
                n/=3; count3++;
            }
            if(n!=1){
                System.out.println(-1);
                continue;
            }
            if(count2>count3 || count3==0){
                System.out.println(-1); continue;
            }
            if(count2==count3){
                System.out.println(count2);
            }
            else {
                int out=count3;
                out+=Math.abs(count3-count2);
                System.out.println(out);

            }

        }
    }
}
