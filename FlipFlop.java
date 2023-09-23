import java.util.Scanner;

public class FlipFlop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i]=sc.nextInt();
            boolean b = true;
            int sum=0, indx=-1;
            for(int i=0 ; i<n ; i++)
            {
                sum+=arr[i];
                if((i<n-1)&&(b))
                {
                    if((arr[i]==-1)&&(arr[i+1]==-1))
                    {
                        indx=i;
                        b=false;
                    }
                }
            }
            //System.out.println(sum);
            if(sum==n)
                System.out.println(sum-4);
            else if(sum==n-1)
                System.out.println(sum);
            else if((sum<n-1)&&(b))
                System.out.println(sum);
            else if((sum<n-1)&&(b==false))
                System.out.println(sum+4);
        }
        sc.close();
        
    }
}