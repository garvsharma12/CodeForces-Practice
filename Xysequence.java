import java.util.Scanner;

public class Xysequence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        while(loop-->0)
        {
            int n = sc.nextInt();
            long B = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long[] arr = new long[n+1];
            arr[0]=0;

            for(int i=1 ; i<n+1 ; i++)
            {
                arr[i]=arr[i-1]+x;
                if(arr[i]>B)
                    arr[i]=arr[i-1]-y;
            }
            long sum=0;
            for(int i=0 ; i<n+1 ; i++)
                sum+=arr[i];

            System.out.println(sum);
        }
        sc.close();
    }
}