import java.util.Scanner;
public class ProgrammersandMathematicians {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if(a==b)
                {
                    long val = (a+b)/4; 
                    System.out.println(val);
                }
                else if(a==0 || b==0)
                    System.out.println(-1);
                else 
                {
                    if(a>b)
                    {
                        if(a%3==0)
                        {
                            int k = a/3;
                            if(k>b) System.out.println(b);
                            else System.out.println(k);
                        }
                        else
                        {
                            int k = a/3;
                            int r = a%3;
                            if(b>=k)
                            {
                                long out=k;
                                b-=k;
                                b+=r;
                                out+=b/4;
                                System.out.println(out);
                            }
                            else System.out.println(b);
                        }
                    }
                    else 
                    {
                        if(b%3==0)
                        {
                            int k = b/3;
                            if(k>a) System.out.println(a);
                            else System.out.println(k);
                        }
                        else
                        {
                            int k = b/3;
                            int r = b%3;
                            if(a>=k)
                            {
                                long out=k;
                                a-=k;
                                a+=r;
                                out+=a/4;
                                System.out.println(out);
                            }
                            else System.out.println(a);
                        }
                    }
                }

                
            }
        }
    }
}
