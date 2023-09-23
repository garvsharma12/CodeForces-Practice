import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long p = sc.nextLong();
            int n = sc.nextInt();
            boolean b = true;
            int[] arr = new int[10001];
            int mx = Integer.MIN_VALUE;
            int mn = Integer.MAX_VALUE;
            while(n-->0){
                int drag=sc.nextInt();
                if(drag>mx) mx=drag;
                if(drag<mn) mn=drag;
                int reward = sc.nextInt();
                arr[drag]+=reward;
            }
      // System.out.println(mn+"*");
            //System.out.println(mx+"@");
            while(mn<=mx){
               // System.out.println(mn+"()");
                if(arr[mn]!=0 && mn<p) p+=arr[mn];
                else if(mn>p){
                    b=false;
                    break;
                }
                mn++;
            }
            if(b==false) System.out.println("NO");
            else if(b && p>mx) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
