import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mn = Integer.MAX_VALUE;
        for(int i=0 ;i<n ;i++){
            int k = sc.nextInt();
            mn = Math.min(mn,Math.abs(k));
        }
        System.out.println(mn);
    }
}
