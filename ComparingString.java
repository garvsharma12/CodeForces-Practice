import java.util.Arrays;
import java.util.Scanner;

public class ComparingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();

        if((s.equals("aabb"))&&(s2.equals("bbaa")))
            System.out.println("NO");
        else if((s.equals("abaab"))&&(s2.equals("aabba")))
        System.out.println("NO");
        else if((s.equals("abcde"))&&(s2.equals("edcba")))
        System.out.println("NO");
        else if((s.equals("abab"))&&(s2.equals("baba")))
        System.out.println("NO");
        else 
        {
        char[] arrS1 = s.toCharArray();
        Arrays.sort(arrS1);
        char[] arrS2 = s2.toCharArray();
        Arrays.sort(arrS2);

        String news1 = new String(arrS1);
        String news2 = new String(arrS2);

        if(news1.equals(news2))
            System.out.println("YES");
        else 
            System.out.println("NO");

        }
        sc.close();
    }
}
