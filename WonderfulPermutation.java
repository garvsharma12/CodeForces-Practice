import java.util.Scanner;

public class WonderfulPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p=k;
            int[] arr = new int[n];
            for(int i=0 ;i<n ; i++){
               arr[i]=sc.nextInt();
                if(arr[i]<=p&& i<p) k--;
            }
            System.out.println(k);
        }
    }
}
