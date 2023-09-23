import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-->0)
            {
                int x = sc.nextInt();
                if(x<=9) System.out.println(x);
                else if(x>=46) System.out.println(-1);
                else 
                {
                    int y=9;
                    String s="";
                    while(x!=0)
                    {
                        if(x-y>=0)
                        {
                            s+=Integer.toString(y);
                            x-=y;
                        }
                        y--;
                    }
                    StringBuffer sb = new StringBuffer(s);
                    StringBuffer out = sb.reverse();
                    System.out.println(out);
                }
            }
        }
    }
}
