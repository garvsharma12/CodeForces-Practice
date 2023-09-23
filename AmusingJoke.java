import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String T = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        int LEN = T.length();

        if(len1+len2!=LEN)
        {
             System.out.println("NO");
        }
        else 
        {
        String S = s1+s2;
        char arr1[] = S.toCharArray();
        Arrays.sort(arr1);

        String Y= String.valueOf(arr1);

        char arr2[] = T.toCharArray();
        Arrays.sort(arr2);
        String X= String.valueOf(arr2);

        if(X.equals(Y))
            System.out.println("YES");
        else 
            System.out.println("NO");

        }
        sc.close();
    }
}
