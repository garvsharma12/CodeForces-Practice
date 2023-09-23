import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==1)
            System.out.println(-1);
        else if(n%2==0)
        {
            for(int i=n ; i>=1 ; i--)
                System.out.print(i+" ");
        }
        /*else
        {
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i]=n-i;
            
            int val = (int)Math.floor(n/2);
            int temp=arr[val];
            arr[val]=arr[0];
            arr[0]=temp;

            for(int i=0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
        }*/

        sc.close();
    }
}
