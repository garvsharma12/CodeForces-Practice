import java.util.Scanner;

public class TechnicalSupport{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n-->0)
            {
                int ln = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                if(s.charAt(ln-1)=='Q') System.out.println("No");
                else 
                {
                    int q=0 ;
                    for(int i=0;i<ln ;i++)
                    {
                        if(s.charAt(i)=='Q') q++;
                        else q--;

                        if(q<0) q=0;
                    }
                    if(q==0) System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        } 
    }
}