import java.util.Scanner;

public class KillMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i]=sc.nextInt();
            int count1=0;

            for(int i=0 ; i< n ;i++)
            {
                if(arr[i]==1)
                    count1++;
            }
            if(count1%2==0)
            {
                System.out.println(count1/2+(n-count1));
            }
            else if(count1==1) 
            {
                System.out.println(n);
            }
            else if((count1>1)&&(count1%2!=0))
            {
                System.out.println(n-(count1-1)+1);
            }
            else 
                System.out.println(n);


        }

        sc.close();
    }
}
