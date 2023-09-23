import java.util.Scanner;

public class SpaceNavigation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
                int x = sc.nextInt();
                int y =sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                int a = (int)Math.abs(x);
                int b = (int)Math.abs(y);
                char req1 ='a' , req2 ='s';
                if(x<0) req1='L';
                else if(x>0) req1 = 'R';

                if(y<0) req2 = 'D';
                else if(y>0) req2= 'U';

                if(req1=='a' && req2=='s') System.out.println("YES");
                else 
                {
                    for(int i=0 ; i<s.length() ;i++)
                    {
                        if(s.charAt(i)==req1) 
                        {
                            a--;
                        }
                        else if(s.charAt(i)==req2) b--;
                    }
                    if(a<=0 && b<=0) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
