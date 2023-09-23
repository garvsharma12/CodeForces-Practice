import java.util.Scanner;

public class UltraFastMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        //String s1 = Integer.toString(num1);
        //String s2 = Integer.toString(num2);
        String output="";
        int len=num1.length();
        for(int i=0 ; i<len ; i++)
        {
            if(((num1.charAt(i)=='1')&&(num2.charAt(i)=='1'))||((num1.charAt(i)=='0')&&(num2.charAt(i)=='0')))
                output+="0";
            else 
                output+="1";
        }
        System.out.println(output);
        sc.close();
    }
}
