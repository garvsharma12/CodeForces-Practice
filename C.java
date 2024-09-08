import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();
            int x=sc.nextInt();
            sc.nextLine();
            for(int i=1 ; i<=x ; i++){
                String s = sc.nextLine();
                int len = s.length();
                if(len!=n){
                    System.out.println("NO");
                    continue;
                }
            }
        }
    }
}
