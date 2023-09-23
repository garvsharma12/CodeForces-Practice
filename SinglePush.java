import java.util.Scanner;
public class SinglePush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] a = new int[n+2];
            int[] b = new int[n+2];
            for(int i=1 ;i<=n ; i++) a[i]=sc.nextInt();
            boolean B= true;
            for(int i=1 ;i<=n ; i++){ 
                b[i]=sc.nextInt();
                a[i]=b[i]-a[i];
                if(a[i]<0){
                    B=false;
                }
            }
            if(!B){
                System.out.println("NO");
                continue;
            }
            int count =0;
            for(int i=0 ;i<n+1 ; i++){
                if(a[i]!=a[i+1]){
                    count++;
                }
            }
            if(count==2 || count==0) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
