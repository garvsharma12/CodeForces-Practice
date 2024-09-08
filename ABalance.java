
import java.util.Scanner;

public class ABalance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String user = sc.nextLine();
            int n = user.length();
            run(user,n);
        }
    }
    static void run(String s , int n){
        if(n==1){
            System.out.println(s); return;
        }
        if(s.charAt(0)==s.charAt(n-1)){
            System.out.println(s);
            return;
        }
        if(s.charAt(0)=='a' && s.charAt(n-1)=='b'){
            s="b"+s.substring(1);
            System.out.println(s); return ;
        }
        else{
            s="a"+s.substring(1);
            System.out.println(s); 
            return;
        }
    }
}