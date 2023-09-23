import java.util.Scanner;

public class iLoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i]=sc.nextInt();

        int count=0;
        int min=arr[0] , max=arr[0];
        //int maxi = arr[0];
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i]>max)
            {
               // System.out.println(max);
                count++;
                max=arr[i];
                
            }
            else if(arr[i]<min)
            {
                //System.out.println(min);
                count++;
                min=arr[i];
            }
        }
        System.out.println(count);

        sc.close();
    }
}
