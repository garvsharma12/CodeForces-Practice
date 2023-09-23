import java.util.Arrays;
import java.util.Scanner;

class CSUMQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            if(i==0) arr[i]=sc.nextInt();
            else {
                int k = sc.nextInt();
                arr[i]=k+arr[i-1];
            }
        }
        System.out.println(Arrays.toString(arr));
        int q = sc.nextInt();
        while(q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l==0 && r==0 ) System.out.println(arr[0]);
            else if(l==r){
                System.out.println(arr[r]-arr[r-1]);
            }
            else{
                if(l==0) System.out.println(arr[r]);
                else System.out.println(arr[r]-arr[l-1]);
            }
        }
    }
}
