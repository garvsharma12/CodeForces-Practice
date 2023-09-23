import java.util.Scanner;
public class CodeForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String s = "codeforces";
        sc.nextLine();
        while(loop-->0)
        {
            String c = sc.nextLine();
            char p = c.charAt(0);
            if(s.contains(c))
                System.out.println("YES");
            else 
                System.out.println("NO");
            //System.out.println(c);
            
        }
        sc.close();
    }
}
