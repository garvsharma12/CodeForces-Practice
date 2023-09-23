import java.util.Scanner;

public class PetrBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for(int j=0 ; j<7 ; j++)
            arr[j]=sc.nextInt();
        int sum=0;
        int i=0;
        while(true)
        {
            sum+=arr[i];

            if(sum>=n)
            {
                System.out.println(i+1);
                break;
            }
            if(i==6)
            {
                i=0;
                continue;
            }

            i++;
        }
        
        sc.close();
    }
}
