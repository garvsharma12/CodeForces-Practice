import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String output="";
        int len = str.length();
        if(str.length()<3)
            System.out.println(str);
        else 
        {
            int i=0;
        for(; i<=str.length()-3 ; i++)
        {
            if((str.charAt(i)=='W')&&(str.charAt(i+1)=='U')&&(str.charAt(i+2)=='B'))
            {
                i+=2;
                output+=" ";
            }
            else 
                output+=""+str.charAt(i);
        }
        if(i>=len-3)
        {
            output+=""+str.substring(i, len);
        }
        String out = output.trim();
        System.out.println(out);

        }
        sc.close();
    }
}