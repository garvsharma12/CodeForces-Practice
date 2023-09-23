import java.util.Scanner;

public class GennadyCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String[] cards = new String[5];
        for(int i=0 ; i<5 ; i++)
            cards[i] = sc.next();

        char c1 = one.charAt(0);
        char c2 = one.charAt(1);
        boolean b = true;

        for(int i=0 ; i<5 ; i++)
        {
            String s = cards[i];
            if(s.charAt(0)== c1)
            {
                System.out.println("YES");
                b=false;
                break;
            }
        }
        if(b==true)
        {
            for(int i=0 ; i<5 ; i++)
          {
            String s = cards[i];
            if(s.charAt(1)== c2)
            {
                System.out.println("YES");
                break;
            }
            else if(i==4)
                System.out.println("NO");
         }
        }
        sc.close();
    }
}
