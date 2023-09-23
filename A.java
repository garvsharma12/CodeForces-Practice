import java.util.*;

public class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s = sc.nextLine();
            if(s.equals("cab")|| s.equals("bca")) System.out.println("NO");
            else System.out.println("YES");

        }
        
    }
}