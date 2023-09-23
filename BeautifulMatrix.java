import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5 , n2=5;
        int row=0 , col=0;
        int[][] arr = new int[n][n2];

        for(int j=0 ; j<n ;j++)
        {
            for(int i=0 ; i<n2 ; i++)
            {
                arr[j][i]=sc.nextInt();
                if(arr[j][i]!=0)
                {
                    row=j;
                    col=i;
                }
            }
        }
        //System.out.println(row+" "+col);
        System.out.println(Math.abs(2-row)+Math.abs(2-col));
        
        sc.close();
    }
}
