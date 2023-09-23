import java.util.Scanner;

public class IncreasingAndDecreasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int x= sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            if(n>=y){
                System.out.println(-1);
            }
            else{
                boolean b = true;
                int[] arr = new int[n];
                arr[0]=x ; arr[n-1]=y;
                int diff=1;
                for(int i=n-2 ; i>=1 ; i--){
                    arr[i]=arr[i+1]-diff;
                    diff++;

                    if(arr[i]<=0 || arr[i]==arr[i+1]){
                        b=false; System.out.print(-1); break;
                    }
                    else if(i!=n-2){
                        int temp1= arr[i+1]-arr[i];
                        int temp2 = arr[i+2]-arr[i+1];
                        if(temp1<=temp2){
                            System.out.print(-1); b=false; break;
                        }
                    }
                }
                if(b && arr[1]-arr[0]<=arr[2]-arr[1]){
                    System.out.print(-1); b=false;
                }
                if(b){
                    for(int i=0 ;i<n ;i++) System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}