import java.util.Scanner;

public class Advancer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i]=sc. nextInt();
        
        int chk= arr[k-1];
        int count=0;
        if(chk==0)
        {
            for(int i=0 ; i<n ; i++)
            {
                if(arr[i]!=0)
                    count++;
            }
        }
        else 
        {
        for(int i=0 ; i<n ; i++)
        {
            if(chk<=arr[i])
                count++;

        }
    }
        System.out.println(count);
        sc.close();
    }
        
        
    
}