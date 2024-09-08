import java.util.Scanner;

public class DistancedColouring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n =sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if(n<k && m<k){
                long res = n*m;
                System.out.println(res);
            }
            else if(n>=k && m>=k){
                long res = k*k;
                System.out.println(res);
            }
            else if(n>=k && m<k){
                long res = k*m;
                System.out.println(res);
            }
            else{
                long res = k*n;
                System.out.println(res);
            }
        }
    }
}