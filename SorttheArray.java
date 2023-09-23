import java.util.Arrays;
import java.util.Scanner;
public class SorttheArray
{   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++)
            a[i]=sc.nextInt();
        int[] b = a.clone();
        Arrays.sort(b);

        int srt=0 , end=0;
        
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]!=b[i])
            {
                srt=i+1;
                break;
            }
        }
        for(int i=n-1 ;i>=0 ; i--)
        {
            if(a[i]!=b[i])
            {
                end=i+1;
                break;
            }
        }
        if(srt==end) 
        {
            System.out.println("yes");
            System.out.println(1+" "+1);
        }
        else {
        int temp[] = Arrays.copyOfRange(a, srt-1, end);
        int k=temp.length-1;
        for(int i=srt-1 ; k>=0 ;i++){
            a[i]=temp[k];
            k--;
        }
        if(Arrays.equals(a,b))
        {
            System.out.println("yes");
            System.out.println(srt+" "+end);
        }
        else System.out.println("no");
    }

        sc.close();
    }
}