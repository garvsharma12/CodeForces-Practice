import java.util.Scanner;

public class GeneralArrival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int[] arr = new int[loop];

        for(int i=0; i<loop ; i++)
            arr[i]=sc.nextInt();
        int min=arr[loop-1] , max=arr[0], min_indx=loop-1 , max_indx=0;

        for(int i=loop-2 ; i>=0 ; i--)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                min_indx=i;
            }
        }

        for(int i=1 ; i<loop ; i++)
        {
            if(arr[i]>max)
                max_indx=i;
        }

        System.out.println("max= "+max_indx+" min= "+min_indx);
        System.out.println(Math.abs(max_indx)+Math.abs(min_indx-(loop-1)));

        sc.close();
    }
    
}
