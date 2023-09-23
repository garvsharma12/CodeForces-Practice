import java.util.Scanner;

public class TrailingZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 5;
        int rem = n%5;
        int num=n-rem , out=0;
        while(f<=num){
            out+=n/f;
            f*=5;
        }
        System.out.println(out);
    }
}