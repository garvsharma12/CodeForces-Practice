import java.util.Scanner;

public class ColourBlind
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        
        while(loop-->0)
        {
            int size = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            boolean b=true;
            for(int i=0 ; i<size ; i++)
            {
                if(((s1.charAt(i)=='R')&&(s2.charAt(i)!='R'))||(((s2.charAt(i)=='R')&&(s1.charAt(i)!='R'))))
                {
                    System.out.println("No");
                    b=false;
                    break;
                }   
            }
            if(b==true)
                System.out.println("Yes");
        }
        sc.close();
    }
}