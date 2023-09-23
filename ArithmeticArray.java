import java.util.Scanner;

public class ArithmeticArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int temp=0;
                for(int i=0;i<n ;i++)
                { arr[i]=sc.nextInt();
                    temp+=arr[i];
                }
                if((temp/n)==1 && temp%n==0) System.out.println(0);
                else if(n+1-temp>=0) System.out.println(1);
                else 
                {
                    System.out.println(temp-n);
                }
            }
        }
    }
}
