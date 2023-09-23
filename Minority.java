import java.util.Scanner;

public class Minority{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long loop = sc.nextLong();
        sc.nextLine();
        while(loop-->0)
        {
            String s = sc.nextLine();
            long count_0= (long) 0 , count_1=(long)0;

            if(s.length()==1)
                System.out.println(0);
            else
            {
            for(int i=0 ; i<s.length() ; i++)
            {
                if(s.charAt(i)=='0')
                    count_0++;

                else
                    count_1++;
            }

            if(count_0<count_1)
                System.out.println(count_0);
            else if(count_0>count_1)
                System.out.println(count_1);
            else
            {
                if(s.charAt(s.length()-1)==0)
                    System.out.println(count_0-1);
                else 
                    System.out.println(count_1-1);
            }

            }
        }
        sc.close();
    }
}