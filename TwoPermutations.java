import java.util.Scanner;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(twoPermu(n,a,b));
        }
    }
    public static String twoPermu(int n, int a, int b){
        if(n==a && a==b) return "Yes";
        if((n-(a+b))>=2) return "Yes";
        return "No";
    }
}
