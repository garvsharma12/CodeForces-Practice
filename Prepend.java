import java.util.Scanner;

public class Prepend {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int temp=n;
            boolean b = true;
            if(n==1)
                System.out.println(1);
            else if(n%2==1)
            {
            for(int i=0 , j=n-1 ; i<=j ; i++ , j--)
            {
                if(((s.charAt(i)=='0')&&(s.charAt(j)=='0'))||((s.charAt(i)=='1')&&(s.charAt(j)=='1')))
                {
                    System.out.println(temp);
                    b=false;
                    break;
                }
                else 
                    temp-=2;
            }
            if(b)
                System.out.println(temp);
            }

            else if(n%2==0)
            {
            for(int i=0 , j=n-1 ; i<j ; i++ , j--)
            {
                if(((s.charAt(i)=='0')&&(s.charAt(j)=='0'))||((s.charAt(i)=='1')&&(s.charAt(j)=='1')))
                {
                    System.out.println(temp);
                    b=false;
                    break;
                }
                else 
                    temp-=2;
            }
            if(b)
                System.out.println(temp);
            }
        }
    }
}
