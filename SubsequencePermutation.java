import java.util.Arrays;
import java.util.Scanner;

public class SubsequencePermutation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                char[] temp = s.toCharArray();
                Arrays.sort(temp);
                String tem = String.valueOf(temp);
                int count=0;
                for(int i=0 ;i<n ;i++)
                    if(s.charAt(i)!=tem.charAt(i)) count++;
                System.out.println(count);
            }
        }
    }
}
