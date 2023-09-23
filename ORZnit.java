import java.util.Scanner;

public class ORZnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long z = sc.nextLong();
            long mx = 0;
            long[] arr = new long[n];
            for(int i=0 ;i<n ;i++){
                arr[i]=sc.nextLong();
                arr[i]=Math.max(arr[i],arr[i]&z);
                arr[i]=Math.max(arr[i],arr[i]|z);
                mx = Math.max(mx,arr[i]);
            }
            System.out.println(mx);
        }
    }
}
