import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++)
            arr[i]=i+1;

        if(n==1)
            System.out.println(1);
        if(n<4)
            System.out.println("NO SOLUTION");
        else if(n==5)
            System.out.println(4+" "+2+" "+5+" "+3+" "+1);
        else
        {
            if(n%2==1)
            {
                for(int i=0 ; i<n/2 ; i++)
                {
                    if(i%2==1)
                    {
                        int temp = arr[i];
                        arr[i]=arr[(n-1)-i];
                        arr[(n-1)-i]=temp;
                    }
                }
                int temp=arr[n/2];
                arr[n/2]=arr[0];
                arr[0]=temp;
            }

            else 
            {
                for(int i=0 ; i<(n/2)-1; i++)
                {
                    if(i%2==1)
                    {
                        int temp=arr[i];
                        arr[i]=arr[(n-1)-i];
                        arr[(n-1)-i]=temp;
                    }
                }
                int temp=arr[(n/2)-1];
                    arr[(n/2)-1]=arr[0];
                    arr[0]=temp;

                    temp=arr[n/2];
                    arr[n/2]=arr[n-1];
                    arr[n-1]=temp;
            }
            for(int i=0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
