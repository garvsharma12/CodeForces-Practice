import java.util.Scanner;

public class LastYearString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            if(n<4)
                System.out.println("NO");
            else if(n==4)
            {
                if(s.equals("2020")) System.out.println("YES");
                else System.out.println("NO");
            }
            else
            {
                boolean b = true;
                if(s.charAt(0)=='2' && s.charAt(1)=='0' && s.charAt(2)=='2' && s.charAt(3)=='0')
                {
                    System.out.println("YES");
                    b=false;
                }
                else if(s.charAt(n-4)=='2' && s.charAt(n-3)=='0' && s.charAt(n-2)=='2' && s.charAt(n-1)=='0')
                {
                    System.out.println("YES");
                    b=false;
                }
                else if(s.charAt(0)=='2'&&s.charAt(1)=='0'&&s.charAt(2)=='2'&&s.charAt(n-1)=='0'){
                    System.out.println("YES");
                    b=false;
                }
                else if(b&&s.charAt(0)=='2'&&s.charAt(1)=='0'&&s.charAt(n-2)=='2'&&s.charAt(n-1)=='0')
                {
                    System.out.println("YES");
                    b=false;
                }
                if(b&&s.charAt(0)=='2'&&s.charAt(n-3)=='0'&&s.charAt(n-2)=='2'&&s.charAt(n-1)=='0')
                {
                    System.out.println("YES");
                    b=false;
                }
                if(b)
                    System.out.println("NO");
            }
            
        }
        sc.close();
    }
}
