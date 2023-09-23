import java.util.Arrays;
import java.util.Scanner;
public class GoodArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i]=sc.nextInt();
            
        boolean b= true;
        int mx = Arrays.stream(arr).max().getAsInt();
        int mn = Arrays.stream(arr).min().getAsInt();
        //System.out.println(mx+" "+mn);
        if((arr[0]==mx)&&(arr[n-1]==mn))
        {
            System.out.println(0);
            b=false;
        }
        int len = arr.length;
        int idxmin = minIndex(arr,mn);
        int idxmax = maxIndex(arr,mx);
        //System.out.println(idxmax+" "+idxmin);
        
        if(b==true)
        {
            if(idxmin<idxmax)
                System.out.println(idxmax + ((len-1)-(idxmin+1)));
            else 
                System.out.println(idxmax + ((len-1)-(idxmin)));
        }
        sc.close();
    }

    static int maxIndex(int[] arr,int n) {
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==n)
            {
                return i;
            }
        }
        return -1;

    }
    static int minIndex(int[] arr,int n) {
        int len = arr.length;
        for(int i=len-1 ; i>=0 ; i--)
        {
            if(arr[i]==n)
            {
                return i;
            }
        }
        return -1;

    }
}
