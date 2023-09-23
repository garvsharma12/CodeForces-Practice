import java.util.Scanner;
public class Destroyer{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tt= sc.nextInt();
            while(tt-->0){
                int n = sc.nextInt();
                int[] arr = new int[101];
                int mx =0;
            for(int i=0 ;i<n ;i++){
                int k = sc.nextInt();
                arr[k]++;
                mx = Math.max(mx,k);
            }
            boolean b = true;
            if(n==1){
                if(arr[0]!=1) System.out.println("NO");
                else System.out.println("YES");
                continue;
            }
            int req = arr[0];
            for(int i=1 ;i<=mx; i++){
                if(arr[i]==0){ System.out.println("NO"); b=false ; break;}
                else if(arr[i]>req){
                    System.out.println("NO");
                    b=false;
                    break;
                }
                else{
                    req=arr[i];
                }
            }
            if(b) System.out.println("YES");
   }
        }
    }
}