import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[12];
        for(int i=0 ; i<12 ; i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int count=0 , sum=0;
        if(k==0)
            System.out.println(0);
        else 
        {
            for(int i=11 ; i>=0 ; i--)
            {
                sum+=arr[i];
                count++;
                if(sum>=k)
                {
                    System.out.println(count);
                    break;
                }
            }
        }
        if(sum<k)
            System.out.println(-1);
        sc.close();
    }
}
