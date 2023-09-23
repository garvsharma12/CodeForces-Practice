import java.util.Scanner;

public class JoeyWantsMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long sum=1;
            int[] arr = new int[n];
            for(int i =0 ;i<n ; i++){ arr[i]=sc.nextInt(); sum*=arr[i]; }
            sum+=(n-1);
            System.out.println(sum*2022);
        }
    }
}
