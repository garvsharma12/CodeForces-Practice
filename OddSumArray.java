import java.util.Scanner;

public class OddSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        while(loop-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0 ; i<n ; i++)
                arr[i] = sc.nextInt();

            int c_odd=0 , c_even=0;
            for(int i=0 ; i<n ; i++)
            {
                if(arr[i]%2==0) c_even++;
                else c_odd++;
            }
            if(c_odd==0) System.out.println("NO");
            else if(c_even==0 && n%2==0) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}