import java.util.Scanner;

public class BunLover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            long out = (n*(n+2))+2;
            System.out.println(out);
        }
    }
}
