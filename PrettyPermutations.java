import java.util.Scanner;

public class PrettyPermutations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                if(n%2==0)
                {
                    for(int i=1 ; i<=n ;i++)
                    {
                        if(i%2==1) System.out.print(i+1+" ");
                        else System.out.print(i-1+" ");
                    }
                    System.out.println();
                }
                else 
                {
                    for(int i=1 ; i<n-1 ;i++)
                    {
                        if(i%2==1) System.out.print(i+1+" ");
                        else System.out.print(i-1+" ");
                    }
                    System.out.print(n+" ");
                    System.out.print(n-2+" ");
                    System.out.println();
                }
            }
        }
    }
}
