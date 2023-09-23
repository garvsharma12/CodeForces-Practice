import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i< n ; i++)
            arr[i]=sc.nextInt();

        int chk = 5-k , teams=0 , sum=0;

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]<=chk)
            {
                sum+=1;
                if(sum%3==0)
                {
                    teams=(sum/3);
                }
            }
        }
        System.out.println(teams);
        sc.close();
    }
}
