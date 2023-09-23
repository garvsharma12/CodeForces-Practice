import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        String n= Integer.toString(num);

        boolean b = true;

        if(n.charAt(0)=='4')
            {
                System.out.println("NO");
                b=false;
            }
        if(b)
        {
        for(int i=0 ; i<n.length() ; i++)
        {
            if((n.charAt(i)=='1')||(n.charAt(i)=='4'))
                continue;

            else
            {
                System.out.println("NO");
                b=false;
                break;
            }

        }
        }
        if(b)
        {
            for(int i=0; i<=n.length()-3 ; i++)
            {
                if((n.charAt(i)=='4')&&(n.charAt(i+1)=='4')&&(n.charAt(i+2)=='4'))
                {
                    System.out.println("NO");
                    b=false;
                    break;
                }
            }
        }

        if(b)
        System.out.println("YES");

        sc.close();
    }
}
