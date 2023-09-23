import java.util.Scanner;

public class CubesSorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ;i<n ; i++) arr[i]=sc.nextInt();
            boolean b=true;
            for(int i=1 ; i<n ; i++){
                if(arr[i]<arr[i-1]){
                    continue;
                }
                else{
                    System.out.println("YES");
                    b=false;
                    break;
                }
            }
            if(b) System.out.println("NO");
            else continue;
        }
    }
}