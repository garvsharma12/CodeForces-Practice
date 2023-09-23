import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            while (t-->0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=1 , j=0 ; j<n ;i++)
                {
                    if(i%3!=0 && i%10!=3){ arr[j]=i;
                        j++;}
                }
                System.out.println(arr[n-1]);
            }
        }
    }
}
