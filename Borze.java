import java.util.Scanner;
public class Borze
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int len = s.length();
        String output="";
        if(len==1)
        {
            output+="0";
        }
        else 
        {
        for(int i=0 ; i<len ; i++)
        {
            if((i==len-1)&&(s.charAt(i)=='.')&&(s.charAt(i-1)!='-')&&(len>2))
                output+="0";

            else if(s.charAt(i)=='-')
            {
                if(s.charAt(i+1)=='.')
                    output+="1";
                else 
                    output+="2";

                i++;
            }

            else 
                output+="0";
        }
    }
        System.out.println(output);

        sc.close();
    }
}