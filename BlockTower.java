import java.util.*;

public class BlockTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int out=0;
            if(n==1){
                int temp2 = sc.nextInt();
                System.out.println(temp2);
                continue;
            }
            int[] arr = new int[n+1];
            for( int i=0 ;i<n ; i++){
                if(i==0) out=sc.nextInt();
                else{
                    arr[i]=sc.nextInt();
                }
            }
            int temp=0;
            Arrays.sort(arr);
            for(int i=1 ; i<n+1 ; i++){
                if(arr[i]>out){
                    temp=(int)(((arr[i]-out)/2));
                    if(((arr[i]-out)%2!=0)) out++;
                    out+=temp;
                }
            }
            System.out.println(out);
        }
    }
}
