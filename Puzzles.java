import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];

        for(int i=0 ; i<m ; i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int k=0;
        int[] temp = new int[m-n+1];

        for(int i=0 ; i<=m-n ; i++)
        {
            int[] subArr = Arrays.copyOfRange(arr,i,i+n);
            temp[k]= Arrays.stream(subArr).max().getAsInt()-Arrays.stream(subArr).min().getAsInt();
            k++;
        }
        int output = Arrays.stream(temp).min().getAsInt();
        System.out.println(output);
        
        sc.close();
    }
}
