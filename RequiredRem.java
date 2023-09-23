import java.util.Scanner;

public class RequiredRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            if(n%x==y) System.out.println(n);
            else if(n%x>y){
                int out = n-((n%x)-y);
                System.out.println(out);
            }
            else{
                int out = n-((n%x)+(x-y));
                System.out.println(out);
            }
        }
    }
}
