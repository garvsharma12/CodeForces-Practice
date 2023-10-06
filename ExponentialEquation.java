import java.util.Scanner;

public class ExponentialEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n%2!=0) System.out.println(-1);
            else{
                System.out.println(1+" "+n/2);
            }
        }
    }
}
