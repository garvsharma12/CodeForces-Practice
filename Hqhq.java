import java.util.Scanner;
public class Hqhq
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int len = s.length();
       boolean b=true;
       for(int i=0 ; i<len ; i++)
       {
           if((s.charAt(i)=='Q')||(s.charAt(i)=='H')||(s.charAt(i)=='9'))
           {
               System.out.println("YES");
               b=false;
               break;
           }
           
       }
       if(b==true)
            System.out.println("NO");

        sc.close();
    }
}