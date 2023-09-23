import java.util.Scanner;

public class Panaromix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=n+1 ; i<=m ; i++)
        {
            if((prime(i)))
            {
                if(i==m)
                {
                System.out.println("YES");
                break;
                }
                else
                {
                    System.out.println("NO");
                    break;
                }
            }
            if(i==m)
                System.out.println("NO");
        }
        sc.close();
    }
    static boolean prime(int k)
        {
            for(int j=2 ; j*j<=k ; j++)
            {
                if(k%j==0)
                    return false;
            }
            return true;  

        }
}
