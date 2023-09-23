import java.util.Scanner;

public class YesOryes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s = sc.nextLine();
            int len = s.length();
            String chk = "Yes".repeat(len);
            if(chk.contains(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
