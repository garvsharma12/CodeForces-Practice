import java.util.Arrays;
import java.util.Scanner;

public class Appleman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.nextLine();
        String str = sc.nextLine();

        long[] count = new long[26];
        for(int i=0 ;i<n ; i++)
            count[str.charAt(i)-65]++;

        Arrays.sort(count);
        long output =0l;
        int i=25;

        while(k>=0)
        {
            if(count[i]>=k)
            {
                output+=k*k;
                break;
            }
            else if(count[i]<k)
            {
                output+=count[i]*count[i];
                k-=count[i];
            }
            i--;
        }
        System.out.println(output);
        sc.close();
    }
}
