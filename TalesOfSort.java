import java.util.*;
public class TalesOfSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long cnt=0;
            int[] arr = new int[n];
            for(int i=0;i<n ;i++){
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    cnt = Math.max(cnt, arr[i]);
                }
            }
            System.out.println(cnt);
        }
    }
}
