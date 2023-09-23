import java.util.Scanner;

public class DivisibleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] out = new int[n];
            int sum=0;
            for(int i=0 ;i<n ;i++){
                out[i]=i+1;
                sum+=(i+1);
            }
            if(sum%n==0){
                for(int i=0 ;i<n ;i++){
                    System.out.print(out[i]+" ");
                }
                System.out.println();
            }
            else {
                int div = sum%n;
                int temp = div+1;
                out[0]= temp;
                for(int i=0 ;i<n ;i++){
                    System.out.print(out[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
