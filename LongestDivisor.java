import java.util.Scanner;

public class LongestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long n = sc.nextLong();
            long res=1;
            while(n%res==0){
                res++;
            }
            System.out.println(res-1);
        }
    }
}
