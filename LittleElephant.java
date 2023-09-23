import java.util.Arrays;
import java.util.Scanner;

public class LittleElephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ;i++)
            arr[i]=sc.nextInt();
        int count=0 , indx=0;
        int mini = Arrays.stream(arr).min().getAsInt();
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==mini)
            {
                count++;
                indx=i+1;
            }
        }
        if(count==1)
        {
            System.out.println(indx);
        }
        else 
            System.out.println("Still Rozdil");

            sc.close();
    }
}
