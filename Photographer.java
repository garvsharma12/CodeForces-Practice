import java.util.Arrays;
import java.util.Scanner;

public class Photographer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i=0 ; i<2*n ; i++)
            arr[i]=sc.nextInt();
        boolean b = true;
        Arrays.sort(arr);
        for(int i=0 , j=n; i<n && j<2*n ; i++,j++)
        {
            if(arr[j]-arr[i]<x)
            {
                b=false;
                break;
            }

        }
        if(b==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
        sc.close();
    }
}