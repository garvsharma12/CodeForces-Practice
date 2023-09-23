import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = Integer.toString(n);
            boolean b = true;
            for(int i=0 ; i<s.length() ; i++)
            {
                if(s.charAt(i)!='4' && s.charAt(i)!='7')
                {
                    b=false;
                    break;
                }
            }
            if(b) System.out.println("YES");
            if(b==false)
            {
                if(n%4==0 || n%7==0 || n%47==0 || n%74==0 || n%77==0 || n%44==0)
                System.out.println("YES");
                else System.out.println("NO");
            }
        }

    }
}
