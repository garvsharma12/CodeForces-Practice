import java.util.Scanner;

public class GamingForces {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int count_1=0 , other=0 , output=0;
            for(int i=0 ; i<n ; i++)
            {
                int num = sc.nextInt();
                if(num==1)
                    count_1++;
                else 
                    other++;
            }
            if(count_1%2==0)
                output+=count_1/2;
            else 
            {
                output+=count_1/2;
                output+=count_1%2;
            }
            output+=other;
            System.out.println(output);

        }

        sc.close();
    }
}
