import java.util.Scanner;

public class PetyaString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        int len=s1.length();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        String output="0";

        for(int i=0 ; i<len ; i++)
        {
            int comapare=((s1.charAt(i))-(s2.charAt(i)));
            if(comapare>0){
                output="1";
                break;
            }
            else if(comapare<0){
                output="-1";
                break;
            }

        }
        System.out.println(output);

        sc.close();
    }
}