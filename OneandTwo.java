import java.util.Scanner;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int n = sc.nextInt();
            int[]  arr = new int[n];
            int count=0 , count1=0;

            for(int i=0 ; i<n ; i++)
            {
                int num = sc.nextInt();
                if(num==2)
                {
                    arr[i]=1;
                    count++;
                }
                else 
                {
                    count1++;
                    arr[i]=0;
                }
                
            }
            int temp=count;
            boolean b = true;
            if(count%2!=0)
                System.out.println(-1);
            else if(count==0)
                System.out.println(1);
            else if(count%2==0)
            {
                for(int i=0 ; i<n-1 ; i++)
                {
                    if(arr[i]==1)
                    {
                        count--;
                        if(count==temp/2)
                        {
                            System.out.println(i+1);
                            b=false;
                        }
                    }
                }
                
            }
            //System.out.println(pro);
        }
    }
}
