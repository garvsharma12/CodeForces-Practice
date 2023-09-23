import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i]=sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            int i=0 , j=n-1;
            for( ; i<=j ; i++ , j--)
            {
                a.add(arr[i]);
                a.add(arr[j]);
            }
            for(int h=0 ; h<n ;h++)
                System.out.print(a.get(h)+" ");
                
            System.out.println();
        }
        sc.close();
    }
}
