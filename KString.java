//import java.util.Arrays;
import java.util.Scanner;
public class KString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] arr = new int[26];
        for(int i=0 ; i<str.length() ; i++)
            arr[str.charAt(i)-'a']++;
        String output="",temp="",k="";
        boolean b = true;
        for(int i=0 ; i<26 ; i++)
        {
            if((arr[i]%n==0)&&(arr[i]!=0))
            {
                temp=""+(char)(i+97);
                k=temp.repeat(arr[i]/n);
                output+=k;
            }
            else if(arr[i]%n >= 1)
            {
                b=false;
                System.out.println(-1);
                break;
            }
        }
        if(b)
            System.out.println(output.repeat(n));
        sc.close();
    }
}
