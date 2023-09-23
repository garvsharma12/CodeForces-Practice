import java.util.Arrays;
import java.util.Scanner;

public class PashmakandFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = n;
        long[] arr = new long[n];

        for(int i=0 ; i<n ; i++)
            arr[i]=sc.nextInt(); 

        long mn = Arrays.stream(arr).min().getAsLong();
        long mx = Arrays.stream(arr).max().getAsLong();

        long mx_c=0 , mn_c=0;
        for(int i=0 ; i< n ; i++)
        {
            if(arr[i]==mx) 
                mx_c++;
            else if(arr[i]==mn)
                mn_c++;
        }
        long k = ((p*(p-1))/2);
        if(mx!=mn)
        System.out.println(mx-mn+" "+mn_c*mx_c);
        else 
            System.out.println(0+" "+k);
        sc.close();
    }
}
