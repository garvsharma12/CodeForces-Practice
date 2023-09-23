import java.util.Scanner;

public class MakeEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            sc.nextLine();
            while(t-->0)
            {
                String s = sc.nextLine();
                int n = Integer.valueOf(s);
                int v = Character.valueOf(s.charAt(0));
                if(s.length()<2)
                {
                    if(n%2==0) System.out.println(0);
                    else System.out.println(-1);
                }
                else if(n%2==0)
                    System.out.println(0);
                else if(v%2==0)
                    System.out.println(1);
                else 
                {
                    boolean b =true;
                    for(int i=0 ; i<s.length() ; i++)
                    {
                        int val = Character.valueOf(s.charAt(i));
                        if(val%2==0)
                        {
                            System.out.println(2);
                            b=false;
                            break;
                        }
                    }
                    if(b) System.out.println(-1);
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
