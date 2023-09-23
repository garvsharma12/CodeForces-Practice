import java.util.Arrays;
import java.util.Scanner;

public class Kuriyama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum=0;
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int lk = sc.nextInt();
        int c=0 , l=0 , r=0;
        while(lk-->0)
        {
            c = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            int output=0;
            if(c==2)
            {
                output=sort2(arr , l , r,size , sum);
                System.out.println(output);
            }
            else 
            {
                output=sort(arr,l,r,size,sum);
                System.out.println(output);
            }
        }
        sc.close();
    }
    static int sort2(int[] ar, int l , int r ,int size,int sum)
    {
        if((l==1)&&(r==size))
        {
            return sum;
        }
        else if((l==1)&&(r==size-1))
        {
            int mx = Arrays.stream(ar).max().getAsInt();
            return sum-mx;
        }
        else if((l==2)&&(r==size))
        {
            int mn = Arrays.stream(ar).min().getAsInt();
            return sum-mn;
        }
        else 
        {
            Arrays.sort(ar);
            int[] subArray = Arrays.copyOfRange(ar, l-1, r+1);
            int temp=0 ; 
            for(int i=0 ; i<subArray.length ; i++)
                temp+=subArray[i];
            return temp;
        }
    }

    static int sort(int[] arr , int l , int r , int size , int sum)
    {
        if((l==1)&&(r==size))
        {
            return sum;
        }
        else if((l==1)&&(r==size-1))
        {
            return sum-arr[size-1];
        }
        else if((l==2)&&(r==size))
        {
            return sum-arr[0];
        }
        else 
        {
            int[] subArray = Arrays.copyOfRange(arr, l-1, r);
            int temp=0 ; 
            for(int i=0 ; i<subArray.length ; i++)
                temp+=subArray[i];
            return temp;
        }

    }
}
