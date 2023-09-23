import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[] arr = new int[2];
            boolean b = true;
            for(int i=0 ; i<n ; i++)
            {
                if(s.charAt(i)=='U')
                {
                    arr[1]++;
                    if((arr[0]==1)&&(arr[1]==1))
                    {
                        System.out.println("YES");
                        b=false ;
                        break;
                    }
                }
                if(s.charAt(i)=='D')
                {
                    arr[1]--;
                    if((arr[0]==1)&&(arr[1]==1))
                    {
                        System.out.println("YES");
                        b=false ;
                        break;
                    }
                }
                if(s.charAt(i)=='R')
                {
                    arr[0]++;
                    if((arr[0]==1)&&(arr[1]==1))
                    {
                        System.out.println("YES");
                        b=false ;
                        break;
                    }
                }
                if(s.charAt(i)=='L')
                {
                    arr[0]--;
                    if((arr[0]==1)&&(arr[1]==1))
                    {
                        System.out.println("YES");
                        b=false ;
                        break;
                    }
                }
            }
            if(b)
                System.out.println("NO");
        } 
    }
    
}
