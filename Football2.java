import java.util.Scanner;

public class Football2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        boolean b = true;
        if(len<7)
        {
            System.out.println("NO");
            b=false;
        }
        else 
        {
            for(int i=0 ; i<=len-7 ; i++)
            {
                String s1 = s.substring(i, i+7);
                if((s1.equals("1111111"))||(s1.equals("0000000")))
                {
                    System.out.println("YES");
                    b=false;
                    break;
                }
            }
        }
        if(b)
            System.out.println("NO");
        sc.close();
    }
}
