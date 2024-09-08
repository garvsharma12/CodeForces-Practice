import java.util.*;
public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[n][n];
            sc.nextLine();
            for(int i=0 ;i<n ;i++){
                String s = sc.nextLine();
                for(int j=0 ; j<n ;j++) 
                    arr[i][j]=Character.getNumericValue(s.charAt(j));
            }

        for(int i=0 ; i<n ;i+=k){
            for(int j=0 ; j<n ; j+=k){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        }
    }
}
