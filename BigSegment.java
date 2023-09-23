import java.util.Arrays;
import java.util.Scanner;

public class BigSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        int mn = Arrays.stream(arr1).min().getAsInt();
        int mx = Arrays.stream(arr2).max().getAsInt();
        boolean b= true;
        for(int i=0 ; i<n ; i++)
        {
            if((arr1[i]==mn)&&(arr2[i]==mx))
            {
                System.out.println(i+1);
                b=false;
                break;
            }
        }
        if(b) System.out.println(-1);
        sc.close();
    }
}
