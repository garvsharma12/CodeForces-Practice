import java.util.Scanner;

public class TreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n;i++) arr[i]=sc.nextInt();
            boolean b=true;
            for(int i=1 ;i<n-1;i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    b=false;
                    System.out.println("YES");
                    System.out.println((i)+" "+(i+1)+" "+(i+2));
                    break;
                }
            }
            if(b) System.out.println("NO");
        }
    }
}
