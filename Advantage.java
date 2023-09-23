import java.util.Arrays;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0)
        {
            int size = sc.nextInt(n);
            int[] arr = new int[size];
            for(int i=0 ; i<size ; i++)
                arr[i]=sc.nextInt();

            //int min = Arrays.stream(arr).min().getAsInt();
            //int max = Arrays.stream(arr).max().getAsInt();
            Arrays.sort(arr);
            for(int i=0 ; i<size ; i++)
            {
                if(i==size-1)
                    System.out.print(arr[size-1]-arr[size-2]);
                else    
                System.out.print((arr[i]-arr[size-1])+" ");
            }



        }
        sc.close();
    }
}
