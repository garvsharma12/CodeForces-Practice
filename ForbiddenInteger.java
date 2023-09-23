import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt(); int k = sc.nextInt(); int x = sc.nextInt();
            if(k==1 && x==1) System.out.println("NO");
            else if(n%2==1 && k==2 && x==1) System.out.println("NO");
            else{
                System.out.println("YES");
                if(x!=1){
                    System.out.println(n);
                    for(int i=1 ; i<=n ; i++) System.out.print(1+" ");
                    System.out.println();
                }
                else if(n%2==0){
                    System.out.println(n/2);
                    for(int i=1 ; i<=n/2 ; i++) System.out.print(2+" ");
                    System.out.println();
                }
                else{
                    System.out.println(n/2);
                    for(int i=1 ; i<=n/2-1 ; i++) System.out.print(2+" ");
                    System.out.print(3);
                    System.out.println();

                }
            }
        }
    }
}
