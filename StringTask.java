import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        String s  = sc.nextLine();
        int len = s.length();
        String temp="";
        String temp2 = "";
        for(int i=0 ; i<len ; i++)
        {
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='y'))
                continue;
            else if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='Y'))
                continue;
            else 
                temp+=""+s.charAt(i);
        }

        for(int i=0 ; i<temp.length() ; i++)
        {
            if(Character.isUpperCase(temp.charAt(i)))
                temp2+=("."+Character.toLowerCase(temp.charAt(i)));
            else 
                temp2+=("."+temp.charAt(i));
        }

        System.out.println(temp2);

        sc.close();

    }
}
