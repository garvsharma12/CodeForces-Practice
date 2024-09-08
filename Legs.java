import java.util.Scanner;

public class Legs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int res=(n/4)+((n%4)/2);
            System.out.println(res);
        }
    }
}