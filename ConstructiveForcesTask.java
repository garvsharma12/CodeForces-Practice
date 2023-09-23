import java.util.Scanner;

public class ConstructiveForcesTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println("YES");
                System.out.println("1 -1 ".repeat(n/2));
            }
            else if(n%2==1 && n<5) System.out.println("NO");
            else{
                System.out.println("YES");
                int k=(n-1)/2;
                for(int i=1 ;i<=n ;i++){
                    if(i%2==1) System.out.print(k-1+" ");
                    else System.out.print(-k+" ");
                }
                System.out.println();
            }
        }
    }
}
