import java.util.Arrays;
import java.util.Scanner;

public class DominantPiranha {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t  =sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();
                int mx = Arrays.stream(arr).max().getAsInt();
                int mn = Arrays.stream(arr).min().getAsInt();
                if(mn==mx) System.out.println(-1);
                else 
                {
                    int out =1;
                    if(n==2)
                    {
                        if(arr[0]==mx && arr[1]<mx) out=1;
                        else out=2;
                    }
                    for(int i=1 ;i<n-1 ;i++)
                    {
                        if((arr[i]==mx && arr[i+1]<mx)||(arr[i]==mx && arr[i-1]<mx))
                        {
                            out = i+1;
                        }
                    }
                    if(out==1)
                    {
                        if(n!=2&& arr[n-1]==mx && arr[n-2]<mx) out=n;
                    }
                    System.out.println(out);
                }
             }
        }
    }
}
