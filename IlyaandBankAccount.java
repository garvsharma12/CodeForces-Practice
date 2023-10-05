import java.util.Scanner;

public class IlyaandBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int mx = Integer.parseInt(s);
        int len = s.length();
        String temp1 = s.substring(0,len-1);
        mx = Math.max(mx,Integer.parseInt(temp1));
        String temp2 = s.substring(0,len-2)+""+s.charAt(len-1);
        mx = (Math.max(mx,Integer.parseInt(temp2)));
        System.out.println(mx);
    }
}
