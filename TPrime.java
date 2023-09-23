import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TPrime
{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        long a[] = new long[n];
        String[] strs = line.trim().split("\\s+");
        for(int i=0 ; i<n ; i++)
        {
            a[i] = Long.parseLong(strs[i]);
        }
        for(int i=0 ; i<n ; i++)
        {
            long num = a[i];
        long sqr = (long)(Math.sqrt(num));
        if((sqr*sqr==num)&&(isPrime(sqr)))
            System.out.println("YES");
        else 
            System.out.println("NO");

        }
    }

    public static boolean isPrime(long n)
    {
        for(int i=2 ; i<=n/i ; i++)
        {
            if(n%i==0)
                return false ;
        }
 
        return n>1;
    }
}