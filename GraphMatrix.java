import java.util.Scanner;

class GraphMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n+1][n+1];
        for(int i=0 ;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            matrix[u][v]=1;
            matrix[v][u]=1;
        }
        for(int i=0 ;i<=n;i++){
            for(int j=0 ;j<=n;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=0;
                    System.out.println(i+"->"+j);
                    if(matrix[j][i]==1) System.out.println(j+"->"+i);
                    matrix[j][i]=0;
                }
            }
        }
    }
}