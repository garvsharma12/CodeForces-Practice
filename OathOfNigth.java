import java.util.Arrays;
import java.util.Scanner;

public class OathOfNigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min=Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i=0;i<n ; i++){ arr[i]=sc.nextInt();
            min=Math.min(min,arr[i]);
            max=Math.max(max, arr[i]);
        }
        Arrays.sort(arr);
        if(n<=2) System.out.println(0);
        else{
            int count=0;
            for(int i=0 ;i<n-1 ; i++){
                if(arr[i]!=min && arr[i]!=max) count++;
            }
            System.out.println(count);
        }
    }
}
