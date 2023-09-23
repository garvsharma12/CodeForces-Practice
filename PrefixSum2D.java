import java.util.Scanner;

public class PrefixSum2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i=0 ;i<n ; i++){
                for(int j=0 ;j<m ;j++){
                    if(i==0 && j==0) arr[i][j]=sc.nextInt();
                    else if(i==0 && j!=0){
                        int k=sc.nextInt();
                        arr[i][j]=k+arr[i][j-1];
                    }
                    else if(i!=0 && j==0){
                        int k = sc.nextInt();
                        arr[i][j]=k+arr[i-1][j];
                    }
                    else{
                        int k=sc.nextInt();
                        arr[i][j]=arr[i-1][j]+ arr[i][j-1]+k-arr[i-1][j-1];                
                    }
                }
            }
            // For checking the prefix sum array 
            /*System.out.println();
            System.out.println();
            for(int i=0;i<n ; i++){
                for(int j=0; j<m ; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }*/
            int q = sc.nextInt();
            while(q-->0){
                int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt() , d = sc.nextInt();
                if(a==0 && c==0){
                    System.out.println(arr[c][d]-arr[a][b-1]);
                }
                else if(b==0 && d==0){
                    System.out.println(arr[c][d]-arr[a-1][b]);
                }
                else{
                    int op = arr[c][d]-arr[a-1][d]-arr[c][d-1]+arr[a-1][b-1];
                    System.out.println(op);
                }
            }
        }
    }
}
