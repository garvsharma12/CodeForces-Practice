import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            long n = sc.nextLong();
            if(n%2==1){ System.out.println("YES"); continue;}
            else{
                while(n%2==0){
                    n/=2;
                }
                if(n!=0 && n!=1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
