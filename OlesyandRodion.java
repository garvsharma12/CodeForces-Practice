import java.util.Scanner;
public class OlesyandRodion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String out = Integer.toString(t);
        if(t==10 && n==1) System.out.println(-1);
        else if(t==10){
            out = "1".repeat(n-1);
            out+="0";
            System.out.println(out);
        }
        else{
            out = out.repeat(n);
            System.out.println(out);
        }
    }
}
