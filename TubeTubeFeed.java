import java.util.Scanner;

public class TubeTubeFeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int t = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ; i++) arr[i]=sc.nextInt();
            int ent =0 , out=0 , skip=0; 
            for(int i=0 ; i<n ; i++){
                int b = sc.nextInt();
                if((arr[i]+skip<=t) && (b>ent)){ out=i+1; skip++; ent=b ;}
                else skip++;
            }
            if(out==0) System.out.println(-1);
            else 
            System.out.println(out);
        }
    }
}
